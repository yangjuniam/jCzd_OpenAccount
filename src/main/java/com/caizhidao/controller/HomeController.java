package com.caizhidao.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Pattern;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caizhidao.base.model.JsonResult;
import com.caizhidao.jiaoyisuo.JiaoYiSuoUtil;
import com.caizhidao.model.Customer;
import com.caizhidao.model.RegisterResult;
import com.caizhidao.model.User;
import com.caizhidao.model.VeriCode;
import com.caizhidao.service.AqCunstomerService;
import com.caizhidao.service.SimCunstomerService;
import com.caizhidao.service.VeriCodeService;
import com.caizhidao.utils.HttpClientUtil;
import com.caizhidao.utils.MathUtil;
import com.caizhidao.utils.SMSUtil;

@Controller
@RequestMapping("/")
public class HomeController extends BaseController {

	@Autowired
	private JiaoYiSuoUtil jiaoYiSuoUtil;

	@Autowired
	private AqCunstomerService aqCunstomerService;

	@Autowired
	private SimCunstomerService simCunstomerService;

	@Autowired
	private VeriCodeService veriCodeService;

	@RequestMapping("")
	protected String index() {
		return "index";
	}

	@RequestMapping(value = { "aq", "aq/index" }, method = RequestMethod.GET)
	protected String aqIndex(HttpServletRequest request, Model model) {
		Customer customer = getAqCustomer(request);
		if (customer == null) {
			return "aq/index";
		} else {
			if (customer.isStatus()) {
				return "redirect:/";
			} else {
				return aq_record(request, customer, model);
			}
		}
	}

	@RequestMapping(value = "aq/record", method = RequestMethod.POST)
	protected String aq_record(HttpServletRequest request,
			@ModelAttribute Customer customer, Model model) {
		Customer user = getAqCustomer(request);
		if (user == null) {
			if (!aqCunstomerService.checkExist(customer.getPhone())) {
				if (!veriCodeService.checkValid(new VeriCode(customer
						.getPhone(), request.getParameter("veriCode"), 1))) {
					return error(model, "请输入正确的验证码，或者验证码已经过期");
				}
				User loginedUser = getLoginedUser(request);
				if (loginedUser != null) {
					customer.setUserCode(loginedUser.getUserId());
				}
				// else {
				//
				// HashMap<String, String> map = new HashMap<String, String>();
				// map.put("action", "add");
				// map.put("username", customer.getCustomerName());
				// map.put("userpass", customer.getTradePWD());
				// map.put("sj", customer.getPhone());
				// map.put("email", customer.getEmail());
				// try {
				// String result = HttpClientUtil.doGet(
				// "http://www.51czd.com/userregs.php", map);
				// try {
				// JSONObject object = JSONObject.fromObject(result);
				// if (object.get("userid") != null) {
				// customer.setUserCode(Integer
				// .parseInt((String) object.get("userid")));
				// } else {
				// return error(model, "财之道接口返回失败，请联系管理员");
				// }
				// } catch (JSONException e) {
				// return error(model, "财之道创建账号失败，失败原因【" + result
				// + "】，请联系管理员");
				// }
				// } catch (IOException e) {
				// return error(model, "财之道接口调用失败，请联系管理员");
				// }
				//
				// }
				Cookie[] cookies = request.getCookies();
				for (Cookie cookie : cookies) {
					if (cookie.getName().equals("yqm")) {
						customer.setRealBrokerNo(cookie.getValue());
						customer.setOrganizationNo(cookie.getValue());
						break;
					}
				}
				Customer newCustomer = aqCunstomerService.addCustomer(customer);
				request.getSession().setAttribute("donePhone",
						newCustomer.getPhone());
				model.addAttribute("regCustomer", newCustomer);
				request.getSession().setAttribute("donePhone",
						newCustomer.getPhone());
				try {
					// SMSUtil.sendMessage(customer.getPhone(),
					// "您好，你的实盘开户已经成功提交，您还可以使用手机号码【" + customer.getPhone()
					// + "】和交易密码【" + customer.getTradePWD()
					// + "】直接登录财之道主页，观看财之道视频大厅和房间精彩实时行情分析。");
					SMSUtil.sendMessage(customer.getPhone(),
							"您好，你的实盘开户已经成功提交，您还可以使用手机号码【" + customer.getPhone()
									+ "】和交易密码【" + customer.getTradePWD() + "】登录本系统。");
				} catch (IOException e) {
					e.printStackTrace();
				}

			} else {
				return error(model, "手机号码已经存在，注册失败");
			}
		} else {
			if (user.isStatus()) {
				return "redirect:/";
			} else {
				model.addAttribute("regCustomer", user);
				request.getSession().setAttribute("donePhone", user.getPhone());

			}
		}

		return "aq/record";
	}

	@RequestMapping(value = "aq/result", method = RequestMethod.POST)
	protected String aq_indexPost(HttpServletRequest request, Model model) {
		String phone = (String) request.getSession().getAttribute("donePhone");
		if (phone == null) {
			return error(model, "非法操作，您还未登录");
		} else {
			Customer customer = aqCunstomerService.findAqCustomerByPhone(phone);
			if (customer == null) {
				return error(model, "非法操作，您还未登录");
			} else if (customer.isStatus()) {
				return "redirect:/";
			}
			try {
				RegisterResult registerResult = jiaoYiSuoUtil
						.createAqCustomer(customer);
				if (registerResult.isSuccess()) {
					try {
						SMSUtil.sendMessage(
								customer.getPhone(),
								"尊敬的客户，您的实盘交易账号为【"
										+ customer.getCustomerNo()
										+ "】，交易密码为【"
										+ customer.getTradePWD()
										+ "】，电话密码为【"
										+ customer.getPhonePWD()
										+ "】为了保证您的账户安全，请及时修改您的密码，切勿将账户信息告知他人，注意查收和保存，祝您投资愉快！");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				request.getSession().setAttribute("aqCustomer",
						registerResult.getCustomer());
				model.addAttribute("registerResult", registerResult);
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
			return "aq/result";
		}
	}

	@RequestMapping("sim")
	protected String sim_index(HttpServletRequest request, Model model) {
		Customer customer = getSimCustomer(request);
		if (customer == null) {
			return "sim/index";
		} else if (customer.isStatus()) {
			return "redirect:/";
		} else {
			return sim_indexPost(request, customer, model);
		}
	}

	@RequestMapping(value = "sim/result", method = RequestMethod.POST)
	protected String sim_indexPost(HttpServletRequest request,
			@ModelAttribute Customer customer, Model model) {
		Customer user = getSimCustomer(request);
		if (user == null) {
			if (!simCunstomerService.checkExist(customer.getPhone())) {
				if (!veriCodeService.checkValid(new VeriCode(customer
						.getPhone(), request.getParameter("veriCode"), 0))) {
					return error(model, "请输入正确的验证码，或者验证码已经过期");
				}
				try {
					User loginedUser = getLoginedUser(request);
					if (loginedUser != null) {
						customer.setUserCode(loginedUser.getUserId());
					}
					// else {
					// HashMap<String, String> map = new HashMap<String,
					// String>();
					// map.put("action", "add");
					// map.put("username", customer.getCustomerName());
					// map.put("userpass", customer.getTradePWD());
					// map.put("sj", customer.getPhone());
					// map.put("email", customer.getEmail());
					// try {
					// String result = HttpClientUtil.doGet(
					// "http://www.51czd.com/userregs.php", map);
					// try {
					// JSONObject object = JSONObject
					// .fromObject(result);
					// if (object.get("userid") != null) {
					// customer.setUserCode(Integer
					// .parseInt((String) object
					// .get("userid")));
					// } else {
					// return error(model, "财之道接口返回失败，请联系管理员");
					// }
					// } catch (JSONException e) {
					// return error(model, "财之道创建账号失败，失败原因【" + result
					// + "】，请联系管理员");
					// }
					// } catch (IOException e) {
					// return error(model, "财之道接口调用失败，请联系管理员");
					// }
					//
					// }
					user = simCunstomerService.addCustomer(customer);

					try {
						// SMSUtil.sendMessage(
						// customer.getPhone(),
						// "您好，你的模拟盘开户已经成功提交，您还可以使用手机号码【"
						// + customer.getPhone() + "】和交易密码【"
						// + customer.getTradePWD()
						// + "】直接登录财之道主页，观看财之道视频大厅和房间精彩实时行情分析。");
						SMSUtil.sendMessage(
								customer.getPhone(),
								"您好，你的模拟盘开户已经成功提交，您还可以使用手机号码【"
										+ customer.getPhone() + "】和交易密码【"
										+ customer.getTradePWD() + "】登录本系统。");
					} catch (IOException e) {
						e.printStackTrace();
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				return error(model, "手机号码已经存在，注册失败");
			}
		} else if (user.isStatus()) {
			return "redirect:/";
		}
		try {
			RegisterResult registerResult = jiaoYiSuoUtil
					.createSimCustomer(user);
			if (registerResult.isSuccess()) {
				try {
					SMSUtil.sendMessage(
							customer.getPhone(),
							"尊敬的客户，您的模拟交易账号为【"
									+ customer.getCustomerNo()
									+ "】，交易密码为【"
									+ customer.getTradePWD()
									+ "】，电话密码为【"
									+ customer.getPhonePWD()
									+ "】为了保证您的账户安全，请及时修改您的密码，切勿将账户信息告知他人，注意查收和保存，祝您投资愉快！");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			request.getSession().setAttribute("simCustomer",
					registerResult.getCustomer());
			model.addAttribute("registerResult", registerResult);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return "sim/result";
	}

	@RequestMapping("fengxian")
	protected String fengxian() {
		return "docs/fengxian";
	}

	@RequestMapping("recordEnd/{timestamp}/{recordFile}")
	protected @ResponseBody String recordEnd(HttpServletRequest request,
			@PathVariable long timestamp, @PathVariable long recordFile) {
		request.getSession().setAttribute("record_timestamp", timestamp);
		request.getSession().setAttribute("recordFile", recordFile);
		return "ok";
	}

	@RequestMapping(value = { "aqLogin", "simLogin" })
	protected String aqLogin(HttpServletRequest request, Model model) {
		String uri = request.getRequestURI();
		model.addAttribute("uri", uri);
		switch (uri) {
		case "/aqLogin":
			if (getAqCustomer(request) != null) {
				return "index";
			}
			return "login";
		case "/simLogin":
			if (getSimCustomer(request) != null) {
				return "index";
			}
			return "login";
		default:
			return error(model, "非法操作，进入非法页面");
		}
	}

	@RequestMapping(value = { "aqLogin", "simLogin" }, method = RequestMethod.POST)
	protected String aqLoginPost(@ModelAttribute Customer customer,
			Model model, HttpServletRequest request) {
		String uri = request.getRequestURI();
		switch (uri) {
		case "/aqLogin":
			if (aqCunstomerService.checkAqLogin(customer)) {
				request.getSession().setAttribute(
						"aqCustomer",
						aqCunstomerService.findAqCustomerByPhone(customer
								.getPhone()));
				return "index";
			} else {
				model.addAttribute("msg", "登录失败，账号或密码错误");
				return "login";
			}
		case "/simLogin":
			if (simCunstomerService.checkSimLogin(customer)) {
				request.getSession().setAttribute(
						"simCustomer",
						simCunstomerService.findSimCustomerByPhone(customer
								.getPhone()));
				return "redirect:/";
			} else {
				model.addAttribute("msg", "登录失败，账号或密码错误");
				return "login";
			}
		default:
			return error(model, "非法操作，进入非法页面");
		}
	}

	@RequestMapping(value = { "aqLogout", "simLogout" })
	protected String aqLogout(HttpServletRequest request, Model model) {
		String uri = request.getRequestURI();
		switch (uri) {
		case "/aqLogout":
			request.getSession().removeAttribute("aqCustomer");
			return "redirect:/";
		case "/simLogout":
			request.getSession().removeAttribute("simCustomer");
			return "redirect:/";
		default:
			return error(model, "非法操作，进入非法页面");
		}
	}

	@RequestMapping(value = { "aqCheckExist", "simCheckExist" }, method = RequestMethod.POST)
	protected @ResponseBody JsonResult checkExist(HttpServletRequest request) {
		String uri = request.getRequestURI();
		switch (uri) {
		case "/aqCheckExist":
			return !aqCunstomerService
					.checkExist(request.getParameter("phone")) ? JsonResult.OK
					: JsonResult.FAIL;
		case "/simCheckExist":
			return !simCunstomerService.checkExist(request
					.getParameter("phone")) ? JsonResult.OK : JsonResult.FAIL;
		default:
			return JsonResult.FAIL.message("非法验证");
		}
	}

	@RequestMapping(value = { "sendAqVeriCode", "sendSimVeriCode" }, method = RequestMethod.POST)
	protected @ResponseBody JsonResult sendVeriCode(HttpServletRequest request,
			@ModelAttribute VeriCode veriCode) {
		if (!Pattern.compile("1[3|5|8]\\d{9}")
				.matcher(veriCode.getMobilePhone()).find()) {
			return JsonResult.FAIL.message("请先输入手机号码");
		}
		String uri = request.getRequestURI();
		switch (uri) {
		case "/sendAqVeriCode":
			if (aqCunstomerService.checkExist(veriCode.getMobilePhone())) {
				return JsonResult.FAIL.message("您输入的手机号码已经注册");
			}
			veriCode.setType(1);
			break;
		case "/sendSimVeriCode":
			if (simCunstomerService.checkExist(veriCode.getMobilePhone())) {
				return JsonResult.FAIL.message("您输入的手机号码已经注册");
			}
			veriCode.setType(0);
			break;
		default:
			return JsonResult.FAIL.message("非法验证");
		}
		VeriCode newVeriCode = veriCodeService.findLastOne(veriCode);
		if (newVeriCode != null) {
			return sendSMS(newVeriCode);
		} else {
			if (veriCodeService.checkCount(veriCode) >= 5) {
				return JsonResult.FAIL.message("您今天已经超过验证次数，请明天再试");
			} else {
				veriCode.setVeriCode(String.valueOf(MathUtil.random(1000, 9999)));
				if (veriCodeService.insertVeriCode(veriCode)) {
					return sendSMS(veriCode);
				} else {
					return JsonResult.FAIL.message("验证码发送失败，请联系管理员再试");
				}
			}
		}
	}

	private JsonResult sendSMS(VeriCode veriCode) {
		if (SMSUtil.sendMessage1(veriCode.getMobilePhone(), "欢迎您来银大贵金属"
				+ (veriCode.getType() == 0 ? "模拟盘" : "实盘") + "开户，认证码为："
				+ veriCode.getVeriCode() + "，如有问题，请拨打客服热线95105533")) {
			return JsonResult.OK;
		} else {
			return JsonResult.FAIL.message("验证码发送失败，请联系管理员再试");
		}
	}

	@RequestMapping("/test")
	public String aaa(Model model) {
		Customer customer = new Customer();
		customer.setCustomerNo("195000000222231");
		customer.setTradePWD("123457");
		customer.setPhonePWD("123456");
		String[] ss = new String[2];
		ss[0] = "1";
		ss[1] = "1";
		RegisterResult registerResult = new RegisterResult(ss);
		registerResult.setCustomer(customer);
		model.addAttribute("registerResult", registerResult);
		return "/aq/result";
	}

	@RequestMapping(value = "sendSms")
	protected String sendSms() {
		return "sendSms";
	}

	@RequestMapping(value = "sendSms", method = RequestMethod.POST)
	protected String sendSmsPost(HttpServletRequest request, Model model) {
		try {
			String result = SMSUtil.sendMessage(request.getParameter("mobile"),
					request.getParameter("content"));
			model.addAttribute("result", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "sendSms";
	}

	@RequestMapping(value = "tools/random")
	protected String tools_random(HttpServletRequest request) {
		return "tools/random";
	}
}

package com.caizhidao.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caizhidao.base.model.JsonResult;
import com.caizhidao.common.Constants;
import com.caizhidao.jiaoyisuo.JiaoYiSuoUtil;
import com.caizhidao.model.Customer;
import com.caizhidao.model.User;
import com.caizhidao.service.AqCunstomerService;
import com.caizhidao.service.SimCunstomerService;

@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController {

	@Autowired
	private JiaoYiSuoUtil jiaoYiSuoUtil;

	@Autowired
	private AqCunstomerService aqCunstomerService;

	@Autowired
	private SimCunstomerService simCunstomerService;

	@RequestMapping(value = { "", "login" })
	protected String adminLogin(HttpServletRequest request) {
		if (getSessionAdmin(request) != null) {
			return "redirect:/admin/index";
		}
		return "/admin/login";
	}

	@RequestMapping(value = { "index" })
	protected String index(HttpServletRequest request) {
		if (getSessionAdmin(request) != null) {
			return "/admin/index";
		} else {
			return "/admin/login";
		}
	}

	@RequestMapping(value = { "", "login" }, method = RequestMethod.POST)
	protected String adminLogined(HttpServletRequest request, Model model) {
		if (getSessionAdmin(request) != null) {
			return "redirect:/admin/index";
		} else {
			if (request.getParameter("adminPass").equals("Ciscoh3cP@ssword2022")) {
				request.getSession().setAttribute(Constants.ADMIN_SESSION_NAME,
						"sucess");
				return "redirect:/admin/index";
			} else {
				model.addAttribute("msg", "管理账号密码错误");
				return "/admin/login";
			}
		}

	}

	@RequestMapping(value = { "/sim/list", "/sim" })
	protected String moniList(HttpServletRequest request,
			@ModelAttribute Customer customer, Model model) {
		if (getSessionAdmin(request) == null) {
			return "redirect:/admin";
		}
		customer.setPageSize(1000);
		model.addAttribute("customerList", getSimList(customer));
		return "/admin/sim/list";
	}

	@ResponseBody
	@RequestMapping("/json/simList")
	protected JsonResult simList2(HttpServletRequest request,
			@ModelAttribute Customer customer) {
		return JsonResult.OK.put("list", getSimList(customer))
				.put("count", simCunstomerService.queryCount())
				.put("pageNo", customer.getPageNo())
				.put("pageSize", customer.getPageSize());
	}

	private List<Customer> getSimList(Customer customer) {
		return simCunstomerService.queryCustomerList(customer);
	}

	@RequestMapping(value = { "/aq/list", "/aq" })
	protected String shipanList(HttpServletRequest request,
			@ModelAttribute Customer customer, Model model) {
		if (getSessionAdmin(request) == null) {
			return "redirect:/admin";
		}
		customer.setPageSize(1000);
		model.addAttribute("customerList",
				aqCunstomerService.queryCustomerList(customer));
		return "/admin/aq/list";
	}

	@ResponseBody
	@RequestMapping("/json/aqList")
	protected JsonResult shipanList2(HttpServletRequest request,
			@ModelAttribute Customer customer) {
		return JsonResult.OK.put("list", getShipanList(customer))
				.put("count", aqCunstomerService.queryCount())
				.put("pageNo", customer.getPageNo())
				.put("pageSize", customer.getPageSize());
	}

	private List<Customer> getShipanList(Customer customer) {
		return aqCunstomerService.queryCustomerList(customer);
	}

	@ResponseBody
	@RequestMapping(value = "/json/changeAqRecommendUserCode", method = RequestMethod.POST)
	protected JsonResult changeAqRecommandUserCode(
			@ModelAttribute Customer customer, HttpServletRequest request) {
		User user = getLoginedUser(request);
		if (user == null || user.getUserId() != customer.getUserCode()) {
			return JsonResult.FAIL.message("非法操作，非团队管理员无法变更！");
		}
		return aqCunstomerService.changeAqRecommendUserCode(customer) ? JsonResult.OK
				: JsonResult.FAIL;
	}
}

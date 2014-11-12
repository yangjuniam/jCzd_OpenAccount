package com.caizhidao.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.caizhidao.common.Configuration;
import com.caizhidao.common.Constants;
import com.caizhidao.model.Customer;
import com.caizhidao.model.User;
import com.caizhidao.service.AqCunstomerService;
import com.caizhidao.service.SimCunstomerService;
import com.caizhidao.service.UserService;

public class BaseController {

	@Autowired
	private UserService userService;
	@Autowired
	private SimCunstomerService simCunstomerService;
	@Autowired
	private AqCunstomerService aqCunstomerService;

	protected Long getRecordFile(HttpServletRequest request) {
		return (Long) request.getSession().getAttribute("recordFile");
	}

	protected Customer getSessionAqCustomer(HttpServletRequest request) {
		return (Customer) request.getSession().getAttribute("aqCustomer");
	}

	protected Customer getSessionSimCustomer(HttpServletRequest request) {
		return (Customer) request.getSession().getAttribute("simCustomer");
	}

	protected String error(Model model, String message) {
		model.addAttribute("msg", message);
		return "error";
	}

	protected String success(Model model, String message) {
		model.addAttribute("msg", message);
		return "success";
	}

	protected String getSessionAdmin(HttpServletRequest request) {
		return (String) request.getSession().getAttribute(
				Constants.ADMIN_SESSION_NAME);
	}

	@ModelAttribute("aqCustomer")
	protected Customer getAqCustomer(HttpServletRequest request) {
		return getSessionAqCustomer(request);
	}

	@ModelAttribute("simCustomer")
	protected Customer getSimCustomer(HttpServletRequest request) {
		return getSessionSimCustomer(request);
	}

	@ModelAttribute("user")
	protected User getLoginedUser(HttpServletRequest request) {
//		Cookie[] cookies = request.getCookies();
//		if (cookies == null) {
//			return null;
//		}
//		for (Cookie cookie : cookies) {
//			if (cookie.getName().equals("userid")) {
//				User user = (User) request.getSession().getAttribute("user");
//				if (user != null
//						&& user.getUserId() == Integer.valueOf(cookie
//								.getValue())) {
//					return user;
//				} else {
//					User loginUser = userService.selectOne("findUserByUserId",
//							cookie.getValue());
//					if (loginUser != null) {
//						request.getSession().setAttribute("user", loginUser);
//						Customer aqCustomer = aqCunstomerService
//								.findAqCustomerById(loginUser.getUserId());
//						request.getSession().setAttribute("aqCustomer",
//								aqCustomer);
//						Customer simCustomer = simCunstomerService
//								.findSimCustomerById(loginUser.getUserId());
//						request.getSession().setAttribute("simCustomer",
//								simCustomer);
//						return loginUser;
//					}
//				}
//			}
//		}
//		request.getSession().removeAttribute("user");
//		request.getSession().removeAttribute("aqCustomer");
//		request.getSession().removeAttribute("simCustomer");
		return null;
	}

	@ModelAttribute("config")
	protected Configuration setConfig() {
		return Configuration.getInstance();
	}
}

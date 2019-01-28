package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@RequestMapping(value = "/addUser")
	public ModelAndView addUser() {
		return new ModelAndView("users", "User", "list of users added....");

	}

	@RequestMapping(value = "/getUser")
	public ModelAndView getUser() {
		return new ModelAndView("showusers", "getUser", "list of users....");

	}

	@RequestMapping(value = "/delUser")
	public ModelAndView delUser() {
		return new ModelAndView("deluser", "delUser", "users deleter....");

	}
}

package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class homeController {

	@RequestMapping(value="/")
	public String welcome(){
		return "home";
		//return new ModelAndView("welcomePage", "welcomeMessage", "Welcome to Spring MVC World!!!");
	}
}

package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloworldController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView welcome(){
		System.out.println("am hit");
		return new ModelAndView("welcomePage", "welcomeMessage", "Welcome to Spring MVC World!!!");
	}
}

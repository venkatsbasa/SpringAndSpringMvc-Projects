package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView addNumber(HttpServletRequest req,HttpServletResponse resp) {
		int n1=Integer.parseInt(req.getParameter("n1"));
		int n2=Integer.parseInt(req.getParameter("n2"));
		ModelAndView mv=new ModelAndView();
		mv.setViewName("disply");
		mv.addObject("tot", (n1+n2));
		return mv;
	}
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView welcome(){
		System.out.println("controller hit ....");
		ModelAndView mv=new ModelAndView("welcomePage");
		return mv;
	}

}

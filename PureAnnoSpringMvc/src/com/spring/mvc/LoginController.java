package com.spring.mvc;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.service.LoginService;

@Controller
public class LoginController {
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView addNumber(String un,String pwd) throws SQLException {
		System.out.println(un+"   "+pwd);
		LoginService ls=new LoginService();
		ModelAndView mv=new ModelAndView();
		boolean flg=ls.isValidUser(un, pwd);
		if(flg) {
			mv.setViewName("disply.jsp");
			mv.addObject("un", un);
		}else {
			mv.setViewName("login.jsp");
		}
		return mv;
	}
	/*@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView welcome(){
		System.out.println("controller hit ....");
		ModelAndView mv=new ModelAndView("welcomePage");
		return mv;
	}*/

}

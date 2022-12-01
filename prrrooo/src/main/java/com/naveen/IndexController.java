package com.naveen;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping("hi")
	
//	public ModelAndView hi(@RequestParam("uname") String login,
//			@RequestParam("pwd") String pass,HttpSession session){
	
	public ModelAndView hi(UserDetails ud){
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("detail",ud);
//		modelAndView.addObject("password",pass);
		modelAndView.setViewName("hi");
//		session.setAttribute("username", login);//model
//		session.setAttribute("password", pass);
		//return "hi";
		return modelAndView; 
	}
}

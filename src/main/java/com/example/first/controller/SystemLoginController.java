package com.example.first.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.first.pojo.Users;
import com.example.first.service.IUserService;

/**
 *   用户登录信息
 * @author Thunisoft
 *
 */
@RestController
public class SystemLoginController {
	@Autowired
	private IUserService userServiceImpl;
	//用户登录信息
	@RequestMapping(value="/loginInfo")
	public ModelAndView loginInfo(@RequestParam("username") String usercode,@RequestParam("password") String password,@RequestParam(value="remember",required=false) String remember) 
	{
		System.out.println("接收前台的用户信息："+usercode+";"+password+";"+remember);
		Users userInfo=userServiceImpl.loginInfo(usercode, password);
//		HttpServletRequest request = null;
//		request.setAttribute("userInfo", userInfo);
		ModelAndView mv = new ModelAndView("index.jsp");
		return mv;
	}
}

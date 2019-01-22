package com.example.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	public Users loginInfo(@RequestParam("username") String usercode,@RequestParam("password") String password) 
	{
		System.out.println("接收前台的用户信息："+usercode+";"+password);
		Users userInfo=userServiceImpl.loginInfo(usercode, password);
		return null;
	}

}

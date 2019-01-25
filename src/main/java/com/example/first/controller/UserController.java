package com.example.first.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.pojo.Users;
import com.example.first.service.IUserService;
import com.example.first.utils.RedisUtil;
@RestController
public class UserController {
	@Autowired
	private IUserService userServiceImpl;
	@Resource 
	private RedisUtil redisUtil;
	private List<Users> listresult=null;
	//根据用户的id查询用户信息
	@RequestMapping("/findUserInfoById")
	public Users findUserInfoById(int userid) 
	{
		
		Users userInfo=userServiceImpl.findUserInfoByid(userid);
		return userInfo;
	}
	//查询所有的用户信息
	@RequestMapping("/findAllUserInfo")
	public Object findAllUserInfo()
	{
		listresult=new ArrayList<Users>();
		Object obj=redisUtil.get("findAllUserInfo");
		if(obj==null) 
		{
			listresult = userServiceImpl.findUserListInfo();
			redisUtil.set("findAllUserInfo", listresult, 60*3000L);
		}
		return obj;
	}
	//添加用户
	@RequestMapping("addUsers")
	public int addUsers() 
	{
		
		return userServiceImpl.addUserinfo(new Users());
	}
}

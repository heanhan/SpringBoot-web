package com.example.first.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.first.mapper.IUserMapper;
import com.example.first.pojo.Users;
import com.example.first.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserMapper userMapper;
	
	//根据用户的id查询用户信息
	@Override
	public Users findUserInfoByid(int userid) {
		return userMapper.findUserInfoByid(userid);
	}
	//查询所有用户的信息
	@Override
	public List<Users> findUserListInfo() {
		return userMapper.findUserListInfo();
	}
	//添加用户的信息  使用实体类的方式
	@Override
	public int addUserinfo(Users userInfo) {
		Users users=new Users();
		users.setUserName("lisi");
		users.setUserCode("lisi"+new Date());
		users.setNickName("郭靖");
		users.setUserPwd("123");
		users.setCreateDate(new Date());
		users.setUpdateDate(new Date());
		int i=userMapper.addUserinfo(users);
		System.out.println("添加成功！");
//		int n=1/0;   为测试事务的一行无效代码
		return i;
	}
	//添加用户的信息  使用map 的传值方式
	@Override
	public int addUserMap(Map<String, Object> obj) {
		return 0;
	}

	//更新用户的信息
	@Override
	public int updateUserInfo(Users user) {
		return 0;
	}

	//删除用户的信息
	@Override
	public int deleteUserInfo(int id) {
		return 0;
	}
	
	//用户登录信息
	@Override
	public Users loginInfo(String usercode, String password) {
		return null;
	}

}

package com.example.first.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.example.first.pojo.Users;

public interface IUserService {
	
	//根据用户的id 查询用户信息
	public Users findUserInfoByid(int userid);
	
	//查询所有用户信息
	public List<Users> findUserListInfo();
	
	//添加用户
	@Transactional
	public int addUserinfo(Users userInfo);
	
	//添加用户通过map
	public int addUserMap(Map<String,Object> obj);
	
	//更新用户
	public int updateUserInfo(Users user);
	
	//删除用户 根据用户id
	public int deleteUserInfo(int id);
}

package com.example.first;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.first.pojo.Users;
import com.example.first.service.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootFirstApplicationTests {
	@Autowired
	private IUserService userServiceImpl;

	@Test
	public void contextLoads() {
		List<Users> userList=userServiceImpl.findUserListInfo();
		System.out.println(userList);
		System.out.println("获取的集合为");
	}

}

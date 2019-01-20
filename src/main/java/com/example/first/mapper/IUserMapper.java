package com.example.first.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.first.pojo.Users;

public interface IUserMapper {
	// 根据用户的id 查询用户信息
	@Select("select * from users where userid = #{userId}")
	@Results({ @Result(property = "userId", column = "userid"), @Result(property = "userCode", column = "usercode"),
			@Result(property = "nickName", column = "nickname"), @Result(property = "userName", column = "username"),
			@Result(property = "userPwd", column = "userpwd"), @Result(property = "createDate", column = "createdate"),
			@Result(property = "updateDate", column = "updatedate") })
	public Users findUserInfoByid(int userid);

	// 查询所有用户信息
	@Select("select * from users")
	@Results({ @Result(property = "userId", column = "userid"), @Result(property = "userCode", column = "usercode"),
			@Result(property = "nickName", column = "nickname"), @Result(property = "userName", column = "username"),
			@Result(property = "userPwd", column = "userpwd"), @Result(property = "createDate", column = "createdate"),
			@Result(property = "updateDate", column = "updatedate") })
	public List<Users> findUserListInfo();
	
	//模糊查询用户
	public List<Users> findUserInfoLikeParam();

	// 添加用户
	@Insert("insert into users(userid,nickname,userpwd,createdate,updatedate) values(#{userId},#{nickName},#{userPwd},#{createDate},#{updateDate})")
	public int addUserinfo(Users userInfo);

	// 添加用户通过map
	@Insert("insert into users(userid,username,userpwd) values(#{userId},#{userName},#{userPwd})")
	public int addUserMap(Map<String, Object> obj);

	// 更新用户
	@Update("update set nickname=#{nickName} from users where userid=#{userId}")
	public int updateUserInfo(Users user);

	// 删除用户 根据用户id
	@Delete("delete from users where userid=#{userId}")
	public int deleteUserInfo(int id);

}

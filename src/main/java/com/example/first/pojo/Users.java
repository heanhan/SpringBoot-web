package com.example.first.pojo;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable{
	private static final long serialVersionUID = 5970015529251125757L;
	
	private long userId;
	private String userCode;
	private String userName;
	private String nickName;
	private String userPwd;
	private Date createDate;
	private Date updateDate;
	public Users() {
		super();
	}
	
	public Users(long userId, String userCode, String userName, String nickName, String userPwd, Date createDate,Date updateDate) {
		super();
		this.userId = userId;
		this.userCode = userCode;
		this.userName = userName;
		this.nickName = nickName;
		this.userPwd = userPwd;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userCode=" + userCode + ", userName=" + userName + ", nickName="
				+ nickName + ", userPwd=" + userPwd + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
}

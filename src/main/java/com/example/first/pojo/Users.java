package com.example.first.pojo;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable{
	private static final long serialVersionUID = 5970015529251125757L;
	
	private long userId; //用户的id
	private String userCode;//用户账号
	private String userName;//姓名
	private String nickName;//昵称
	private String userPwd;//密码
	private int loginCount;//登录次数
	private Date loginDate;//上次登录时间
	private int integrate;//积分
	private String sessionId;//用户的session  id
	private Date createDate;//创建日期
	private Date updateDate;//更新日期
	//无参构造函数
	public Users() {
		super();
	}
	//重载构造方法
	public Users(long userId, String userCode, String userName, String nickName, String userPwd, int loginCount,
			Date loginDate, int integrate, String sessionId,Date createDate, Date updateDate) {
		super();
		this.userId = userId;
		this.userCode = userCode;
		this.userName = userName;
		this.nickName = nickName;
		this.userPwd = userPwd;
		this.loginCount = loginCount;
		this.loginDate = loginDate;
		this.integrate = integrate;
		this.sessionId=sessionId;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	//重写setter、getter方法
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
	public int getLoginCount() {
		return loginCount;
	}
	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public int getIntegrate() {
		return integrate;
	}
	public void setIntegrate(int integrate) {
		this.integrate = integrate;
	}
	public String getSessionId() 
	{
		return sessionId;
	}
	public void setSessionId(String sessionId) 
	{
		this.sessionId=sessionId;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	//重写toString()
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userCode=" + userCode + ", userName=" + userName + ", nickName="
				+ nickName + ", userPwd=" + userPwd + ", loginCount=" + loginCount + ", loginDate=" + loginDate
				+ ", integrate=" + integrate + ", sessionId=" + sessionId + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "]";
	}
	
}

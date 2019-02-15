<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息注册</title>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<style type="text/css">
	/* css样式 */
</style>
</head>
<body>
	<div class="container">
		<form action="" role="form" class="form-horizontal" style="padding: 30px;100px;10px;">
			<fileset> <legend>用户信息注册页面</legend> </fileset>
			<div class="form-group">
				<label for="realname" class="col-sm-2 control-label">帐户</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" id="nickname" name="nickname" placeholder="该账号昵称用于账号登录">
				</div>
			</div>
			<div class="form-group">
				<label for="realname" class="col-sm-2 control-label">真实姓名</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" id="realname" name="realname" placeholder="真实姓名">
				</div>
			</div>
			<div class="form-group">
				<label for="" class="col-sm-2 control-label">密码</label>
				<div class="col-sm-4">
					<input type="password" class="form-control" id="password" name="password" placeholder="请输入6-20位密码">
				</div>
			</div>
			<div class="form-group">
				<label for="" class="col-sm-2 control-label">确认密码</label>
				<div class="col-sm-4">
					<input type="password" class="form-control" id="password" name="password" placeholder="请再次确认密码">
				</div>
			</div>
			<div class="form-group">
				<label for="telnumber" class="col-sm-2 control-label">手机号码</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" id="telnumber" name="telnumber" placeholder="手机号码">
				</div>
				<div style="display: inline;">
					<a href="#" target="_blank" style="text-decoration: underline;">获取验证码</a>
				</div>
			</div>
			<div class="form-group">
				<label for="" class="col-sm-2 control-label">学校：</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" id="school" name="school"
						placeholder="选择学校">
				</div>
			</div>
			<div class="form-group">
				<label for="" class="col-sm-2 control-label">所在班级：</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" id="classname"
						name="classname" placeholder="请再次确认密码">
				</div>
			</div>
	</form>
	</div>
</body>
<script type="text/javascript">
	$("#nickname").blur(function() {
		var username = $("#nickname").val()
		alert("获取的当前用户名为" + username);
		$.ajax({
			type : "POST",
			url : "${pageContext.request.contextPath}/login/userValidateInfo",
			data : {//数据
				"username" : username
			},
			dataType : 'json',
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			success : function(result) {
				alert(result.msg);
			},
			error : function(er) { //失败，回调函数
				alert(result);
			}
		});
		return false;
	});
</script>
</html>
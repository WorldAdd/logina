<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>My JSP 'info.jsp' starting page</title>
<link href="static/img/css.css" rel="stylesheet"/>
<link href="static/css/easyui.css" rel="stylesheet"/>
</head>
<body>
				<div class="inner">
					<div class="hd">
						<h3>基本资料
						<a href="<%=path%>/updateheadpic" target="iframepage" class="comfirm">修改</a>
						</h3>
					</div>
					<div class="infos">
					<img src="static/headpic/${user1.headpic}" width="80" height="80"/><br>
					    QQ号码：${user1.qq}<br>
						昵称：${user1.username}<br> 
					 	性别：
						<c:if test="${user1.sex==1}">男</c:if>
						<c:if test="${user1.sex==0}">女</c:if>
						<br>  
						出生日期：${user1.birthday}<br>
						<c:if test="${!empty user1.hometown }">
							家乡住址：${user1.hometown}<br>
						</c:if>
						<c:if test="${empty user1.hometown }">
							家乡住址：未填写<br>
						</c:if>
						<c:if test="${!empty user1.nowaddress }">
							现在住址：${user1.nowaddress}<br>
						</c:if>
						<c:if test="${empty user1.nowaddress }">
							现在住址：未填写<br>
						</c:if>
					 	婚姻状况：
						<c:if test="${user1.ismarry==1}">是</c:if>
						<c:if test="${user1.ismarry==0}">否</c:if>
						<c:if test="${user1.ismarry==-1}">保密</c:if> 
						<br>  
					</div>
				</div>
				<div class="inner">
					<div class="hd">
						<h3>登陆信息</h3>
					</div>
					<div class="infos">
					 	QQ状态：
						<c:if test="${user1.state==1}">正常</c:if>
						<c:if test="${user1.state==0}">冻结</c:if> 
						<br>  
						最近登录时间：${user1.lastvisit}<br>
					</div>
				</div>
				<c:if test="${not empty modify_suc }">
				<div class="inner">
					<div class="hd">
						<h3>修改状况</h3>
					</div>
					<div class="infos">
					 	${modify_suc }
					</div>
				</div>
				</c:if>
	<script type="text/javascript" src="static/js/jquery.js"></script>	
		<script type="text/javascript" src="static/js/jquery.easyui.min.js"></script>
		<script type="text/javascript">
		  $(function() {
			  $(".comfirm").linkbutton();
		  });
		</script>		
</body>
</html>

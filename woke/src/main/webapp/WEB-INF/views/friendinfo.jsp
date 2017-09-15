<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <jsp:include page="header.jsp" /> 
<!DOCTYPE html>
<html>
<head>
<title>My JSP 'info.jsp' starting page</title>
<link href="static/img/css.css" rel="stylesheet"/>
<link href="static/css/easyui.css" rel="stylesheet"/>
</head>
<body>
	<div class="layout-body">
		<div class="w960  clf">
			<div class="m_left">
				<div class="inner pd1">
					<ul class="stats-list clf">
						<li class="first"><strong>${totalfriends}</strong><span>好友</span></li>
						<li><strong>${totalmessages}</strong><span>留言</span></li>
						<li><strong>${totalsfeel}</strong><span>说说</span></li>
					</ul>
				</div>
				<div class="inner mt12 p0">
					<div class="hd">
						<h3>最近访客</h3>
					</div>
					<div class="bd">
						<ul class="avatar-list clf">
							<li><a href="#" target="_blank"><img
									src="static/img/head_snew.jpg" alt="十二的头像" />
									<div class="a-name">十二</div> </a></li>
							<li><a href="#" target="_blank"><img
									src="static/img/head_snew.jpg" alt="十二的头像" />
									<div class="a-name">十二</div> </a></li>
							<li><a href="#" target="_blank"><img
									src="static/img/head_snew.jpg" alt="十二的头像" />
									<div class="a-name">十二</div> </a></li>
							<li><a href="#" target="_blank"><img
									src="static/img/head_snew.jpg" alt="十二的头像" />
									<div class="a-name">十二</div> </a></li>
							<li><a href="#" target="_blank"><img
									src="static/img/head_snew.jpg" alt="十二的头像" />
									<div class="a-name">十二</div> </a></li>
							<li><a href="#" target="_blank"><img
									src="static/img/head_snew.jpg" alt="十二的头像" />
									<div class="a-name">十二</div> </a></li>
							<li><a href="#" target="_blank"><img
									src="static/img/head_snew.jpg" alt="十二的头像" />
									<div class="a-name">十二</div> </a></li>
							<li><a href="#" target="_blank"><img
									src="static/img/head_snew.jpg" alt="十二的头像" />
									<div class="a-name">十二</div> </a></li>
							<li><a href="#" target="_blank"><img
									src="static/img/head_snew.jpg" alt="十二的头像" />
									<div class="a-name">十二</div> </a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="inner">
					<div class="hd">
						<h3>基本资料
						<c:if test="${state==1 }">
						<a href="<%=path%>/feelmy?userid=${user1.userid }&currentPage=1" target="iframepage" class="comfirm">说说</a>
						<a href="<%=path%>/showmessage?receiveid=${user1.userid }&currentPage=1" target="_self" class="comfirm">留言板</a>
						<a href="<%=path%>/user/blackFriend?userid=${user1.userid }" class="comfirm" target="iframepage" onclick="return operaconfirm('拉黑');">拉黑</a>
						<a href="<%=path%>/user/deleteFriend?userid=${user1.userid }" class="comfirm" target="iframepage" onclick="return operaconfirm('删除');">删除</a>
						</c:if>
						<c:if test="${state==-1 }">
						  <a href="<%=path%>/user/regainFriend?userid=${user1.userid }&friendid=${user.userid}" class="comfirm" target="iframepage" onclick="return operaconfirm('恢复好友');" >恢复</a>
					      <a href="<%=path%>/user/deleteblackFriend?userid=${user1.userid }" class="comfirm" target="iframepage"  onclick="return operaconfirm('删除');">删除</a>
						</c:if>
						<c:if test="${state==0 }">
						   <a href="<%=path%>/user/refuseFriend?userid=${user1.userid }" class="comfirm" target="iframepage"  onclick="return operaconfirm('拒绝');">拒绝</a>
						   <a href="<%=path%>/user/agreeFriend?userid=${user1.userid }" class="comfirm" target="iframepage">同意</a>
						</c:if>
						</h3>
					</div>
					<div class="infos">
					    QQ号码：${user1.qq}<br>
						昵称：${user1.username}<br> 
					 	性别：
						<c:if test="${user1.sex==1}">男</c:if>
						<c:if test="${user1.sex==0}">女</c:if>
						<br>  
						出生日期：${user1.birthdayString}<br>
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
						成为好友时间：
						<c:if test="${empty addfriendtimeString }">
							${addfriendtimeString }<br>
						</c:if>
				</div>
				<c:if test="${empty state }">
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
				</c:if>
		</div>
	</div>
				
				
	<script type="text/javascript" src="static/js/jquery.js"></script>	
	<script type="text/javascript" src="static/js/jquery.easyui.min.js"></script>
	<script type="text/javascript">
		  $(function() {
			  $(".comfirm").linkbutton();
		  });
	</script>
	<script type="text/javascript">
		function operaconfirm(opera) {
			question = confirm("你确认要"+opera+"么");
			if (question != "0") {
				return true;
			}
			return false;
		}
	</script>
</body>
</html>

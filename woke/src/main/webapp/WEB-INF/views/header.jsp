<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path =request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>${user1.username }的空间</title>
<script src="static/js/jquery.js" type="text/javascript"></script>
<script src="static/js/v2js.js" type="text/javascript"></script>
<script src="static/js/iframe.js" type="text/javascript"></script>
<link href="static/img/css.css" rel="stylesheet"/>
</head>
<body id="header">
<div id="top">
  <div class="w960">
    <div class="logo"><a href="#" title="#">我的空间</a></div>
    <div class="top_c"></div>
    <div class="top_r"> <pre>中午好，${user1.username }     <a href="<%=path %>/user/logOut">退出</a></pre> </div>
  </div>
</div>
<div id="main">
  <div class="layout-head w960">
    <div class="head-info">
      <h1>${user1.username }的空间</h1>
    </div>
  </div>
  <div class="head_nav">
    <div class="nav_bg"></div>
    <div class="w960">
      <ul>
        <li><a href="<%=path%>/feelallperson">主页</a></li>
        <li><a href="<%=request.getContextPath()%>/hostinfor">个人资料</a></li>
        <li><a href="<%=request.getContextPath()%>/showmessage?receiveid=${user1.userid }&currentPage=1">留言板</a></li>
        <li><a href="<%=path%>/feelmy?userid=${user1.userid }&currentPage=1"">说说</a></li>
        <li><a href="<%=request.getContextPath()%>/showfriends" >好友</a></li>
      </ul>
      <div class="head-avatar">
	  <a href="<%=path %>/jsp/updateheadpic.jsp" target="iframepage"><img src="static/headpic/${user1.headpic }" alt=""/></a>
      </div>
    </div>
  </div>
</div>
</body>
</html>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Expires" content="0" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<title>DHU 科研项目管理平台 | 首页</title>
<link href="<s:url value="/styles/main.css" />" type="text/css" rel="stylesheet" />
<link href="<s:url value="/styles/web.css" />" type="text/css" rel="stylesheet" />
<link href="<s:url value="/styles/index.css" />" rel="stylesheet" type="text/css" />
<link href="<s:url value="/styles/c_about.css" />" type="text/css" rel="stylesheet" />
<script language="JavaScript" src="<s:url value="/js/jquery.min.js" />" type="text/javascript"></script>
<style type="text/css">
<!--
#CopyRight,#Footer {
	margin-top: 8px;
}
-->
</style>
</head>
<body>
<div id="Mheader">
<div class="h">
<div id="logo"><a href="<s:url action="index" namespace="/" />"><img src="<s:url value="/images/logo.png" />" border="0" /></a></div>
<ul id="nav">
    <li id="mz-n1"><a href="<s:url action="index" namespace="/project" />" class="top_link"><span>项目管理</span></a></li>
    <li id="mz-n2"><a href="<s:url action="index" namespace="/fund" />" class="top_link"><span>经费管理</span></a></li>
    <li id="mz-n3"><a href="<s:url action="index" namespace="/research" />" class="top_link"><span>学术管理</span></a></li>
    <li id="mz-n4"><a href="<s:url action="index" namespace="/department" />" class="top_link"><span>科研处管理</span></a></li>
    <li id="mz-n5"><a href="<s:url action="index" namespace="/system" />" class="top_link"><span>系统管理</span></a></li>
</ul>
<div class="globalsearch">
<div class="global"><a href="#">个人中心 <s:property value="#session.user"></s:property></a></div>
</div>
</div>
</div>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>东华大学科研项目管理平台 Sign In </title>
<link rel="stylesheet" href="<s:url value="/styles/login/login.css" />" type="text/css" media="screen" />
<link rel="stylesheet" href="<s:url value="/styles/login/forgot.css" />" type="text/css" media="screen" />
<!--[if IE]>
<link rel="stylesheet" href="<s:url value="/styles/login/ie.css" />" type="text/css" media="screen"/>
<![endif]-->

</head>
<body>
<div class="body-wrap">
	<div class="singin-wrap">
		<s:form action="login" namespace="/login" id="common_signin_form" theme="simple" method="POST">
			<div class="login">
				<h1>DHU 科研项目管理 </h1>
					<div>
						<p id="form_error" class="red"><s:fielderror /></p>
						<div>
							<h2>Username or Email</h2>
							<s:textfield name="username" cssClass="text required"/>
							<h2>Password</h2>
							<s:password cssClass="text required"  name="password" />
					    </div>
				    </div>
			
			</div>
			<div id="extras">
				<input class="button r1" type="submit" value="Sign In">
				<span class="waiting hidden" style="margin-left: 10px;"></span>
		    </div>
		    <div id="copyright">Managed with <a href="#">CSIT DHU</a></div>
		</s:form>
	</div>
    <div id="reflection"></div>
</div>
<script type="text/javascript" src="<s:url value="/js/jquery.min.js" />"></script>
</body>
</html>

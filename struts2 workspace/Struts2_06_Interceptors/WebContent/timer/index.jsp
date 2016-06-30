<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Timer Intercepter Demo</title>
</head>
<body>
<h2>Timer Intercepter Demo</h2>
<s:fielderror />
<s:form action="Sleep" method="post">
<s:submit value="RunTimerAction" name="submit"/>
</s:form>
</body>
</html>
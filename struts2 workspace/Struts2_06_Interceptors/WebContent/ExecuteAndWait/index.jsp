<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>WaitAndExecute Intercepter Demo</title>
</head>
<body>
<h2>WaitAndExecute Intercepter Demo</h2>
<s:fielderror />
<s:form action="Login" method="post">
<s:textfield name="lid" label="Login Id" />
<s:textfield name="lpass" label="Password" />
<s:submit value="Login" name="submit"/>
<s:reset value="Reset"/>
</s:form>
</body>
</html>
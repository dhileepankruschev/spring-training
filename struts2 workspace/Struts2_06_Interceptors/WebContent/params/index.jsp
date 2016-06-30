<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Params demo</title>
</head>
<body>
<h1>Params Interceptor Example</h1>
<s:url id="url" action="paramsdemo">
<s:param name="empId">GS6415</s:param>
<s:param name="empName">Puneet Vashisht</s:param>
<s:param name="empCity">Delhi</s:param>
<s:param name="empSalary">30000</s:param>
</s:url>
<s:a href="%{url}">Params Demo</s:a>
</body>
</html>
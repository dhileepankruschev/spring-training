<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Employee Success Page</title>
</head>
<body>
<h1>Employee details are<br>
Employee Code :<s:property value="code"/><br>
Employee Name :<s:property value="name"/><br>
Employee City :<s:property value="city"/><br>
Employee Salary :<s:property value="salary"/><br>
<a href="./index.jsp"> Try Again</a>
</h1>
</body>
</html>
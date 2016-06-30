<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<title>SuccessPage</title>
</head>
<body>
<h2>Employee details from 2 Actions using Chaining<br>
<hr/>
Employee Code :<s:property value="id"/><br>
Employee Name :<s:property value="name"/><br>
Employee City :<s:property value="city"/><br>
Employee Salary :<s:property value="salary"/><br>
<hr/>
<a href="index.jsp"> Try Again</a>
</h2>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<title>Struts2 Alias interceptor</title>
</head>
<body>
<h2>Employee Details are<br/>
<hr>
Code : <s:property value="empCode" /><br>
Name : <s:property value="empName" /><br>
City : <s:property value="empCity" /><br>
Salary : <s:property value="empSalary" /><br>
</h2>
<a href="alias/index.jsp">Try Again</a>
</body>
</html>
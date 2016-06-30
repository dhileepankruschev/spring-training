<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
	<title>Struts2 alias interceptor</title>
</head>
<body>
<h2>Employee Registration- alias interceptor</h2>
<s:form action="EmployeeAlias.action" method="post">
<s:textfield name="code" label="Enter Code"/>
<s:textfield name="name" label="Enter Name"/>
<s:textfield name="city" label="Enter City"/>
<s:textfield name="salary" label="Enter Salary"/>
<s:submit label="Submit"/>
</s:form>
</body>
</html>
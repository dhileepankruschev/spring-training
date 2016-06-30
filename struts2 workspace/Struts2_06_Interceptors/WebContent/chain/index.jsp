<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts2 Chaining Interceptor</title>
</head>
<body>
<h2>Employee Information</h2>
  <s:form action="Chaining" method="post">
  <s:textfield label="Enter Id" name="id"/>
  <s:textfield label="Enter Name" name="name"/>
  <s:textfield label="Enter City" name="city"/>
  <s:textfield label="Enter Salary" name="salary" value="0"/>
  <s:submit label="Submit"/>
  <s:reset label="Reset"/>
  </s:form>
</body>
</html>
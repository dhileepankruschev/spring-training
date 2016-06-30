<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<body>
	<h2>
		Struts2 redirect result example <br>
		<hr>
		Message :
		<s:property value="message" default="Not Set" />
		<br> Name :
		<s:property value="#request.name" default="Not Set" />
		<br> Address :
		<s:property value="#request.address" default="Not Set" />
		<br>
	</h2>
	<hr>
	<a href="stream/index.jsp">Try Again</a>
</body>
</html>
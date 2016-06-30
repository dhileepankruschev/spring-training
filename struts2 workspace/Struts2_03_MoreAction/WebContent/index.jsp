<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>Employee Registration Page</title>
	</head>
	<body>
		<h1>Employee Registration Form</h1>
		<%-- <s:form action="extends" method="post"> --%>
		<%-- <s:form action="implements" method="post"> --%>
		<s:form action="pojo" method="post">
			<s:textfield label="Enter Code" name="code"/>
			<s:textfield label="Enter Name" name="name"/>
			<s:textfield label="Enter City" name="city"/>
			<s:textfield label="Enter Salary" name="salary"/>
			<s:submit label="Submit"/>
			<s:reset label="Reset"/>
		</s:form>
	</body>
</html>
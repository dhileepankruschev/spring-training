<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h2>Debugging Intercepter Example</h2>
	<s:form action="EmpDebugAction" method="get">
		<s:hidden name="debug" value="browser"></s:hidden>
<%-- 		<s:hidden name="debug" value="xml"></s:hidden> --%>
		<s:textfield label="Enter Code" name="code" />
		<s:textfield label="Enter Name" name="name" />
		<s:textfield label="Enter City" name="city" />
		<s:textfield label="Enter Salary" name="salary" value="0" />
		<s:submit label="Submit" />
		<s:reset label="Reset" />
	</s:form>
</body>
</html>
<%@ page language="java"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title>Param Demo</title>
</head>
<body>
<h2>Employee details</h2>
Code :<s:property value="id" />
<br> Name :<s:property value="name" />
<br> City :<s:property value="city" />
<br> Salary : <s:property value="salary" />
<br>
<a href="index.jsp">Try Again</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>Cookie Aware Demo</h1>
	<s:form action="CreateCookieAction" method="post">
		<s:textfield label="Cookie Name" name="cname" />
		<s:textfield label="Cookie Value" name="cvalue" />
		<s:submit label="Create Cookie" />
	</s:form>
	<hr>
	<s:property value="#request.msg" />
	<br>
	<hr>
	<s:action name="CookieAwareDemo" />
	<h2>Cookie Details</h2>

	<%
		Cookie cookie[] = request.getCookies();
		if (cookie != null)
			for (Cookie c : cookie) {
				 /* if (!c.getName().startsWith("JS")) */ 
					out.println(c.getName() + " " + c.getValue() + "<br>");
			}
	%>
</body>
</html>
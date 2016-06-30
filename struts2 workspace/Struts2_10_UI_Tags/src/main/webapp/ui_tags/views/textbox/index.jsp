<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Textbox Demo</title>
</head>
<body>

<s:form action="showname" namespace="/ui_tags">

	<s:textfield name="username" label="Username" />
	<s:submit key="submit" name="submit" />
	
</s:form>

</body>
</html>
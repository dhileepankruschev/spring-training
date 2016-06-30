<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>

<body>
<h1>Struts 2 Combobox demo</h1>

<s:form action="comboAction" namespace="/">

<h2>
	<s:combobox label="What's your country name" headerKey="-1" headerValue="Select a country" list="countries" name="yourCountry" />
	<s:combobox label="What is today" headerKey="-1" headerValue="Select a day" list="#{'0':'Sunday', '1':'Monday', '2':'Tuesday', '3':'Wednesday', '4':'Thursday', '5':'Friday', '6':'Saturday'}" name="today" />
</h2> 

<s:submit value="submit" name="submit" />
	
</s:form>

</body>
</html>
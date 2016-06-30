<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Registration Form</title>
<s:head />
</head>

<body>
	<s:form action="registeraction">
		<s:textfield name="name" label="Name"></s:textfield>
		<s:textfield name="age" label="Age"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:password name="c_password" label="Confirm Password"></s:password>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:textfield name="contact" label="Contact"></s:textfield>
		<s:radio list="{'male','female'}" name="gender" label="Gender"></s:radio>
 		<s:select cssStyle="width:155px;" list="{'india','USA', 'England', 'others'}" name="country" label="Country"></s:select> 
		<s:submit value="register"></s:submit>

	</s:form>
</body>
</html>
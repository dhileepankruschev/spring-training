<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Employee Form</title>
<!-- 
<%-- <s:head /> --%>
s:head element adds following js and css
<link rel="stylesheet" href="/Struts2_09_DataValidation/struts/xhtml/styles.css" type="text/css"/>
<script src="/Struts2_09_DataValidation/struts/utils.js" type="text/javascript"></script>
 -->
</head>

<body>
   <s:form action="userLogin" method="post">
      <s:textfield name="username" label="Username"/>
      <s:textfield name="age" label="Age"/>
      <s:submit name="submit" label="Submit" align="center" />
   </s:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

<body>
	<h1>Files upload successfully</h1>
	   <div>File Name : <s:property value="multipleFileUploadFileName"/></div>
	   <div>Content Type : <s:property value="multipleFileUploadContentType"/></div> 
	   <div>File Path: <s:property value="multipleFileUpload"/></div>
</body>
</html>
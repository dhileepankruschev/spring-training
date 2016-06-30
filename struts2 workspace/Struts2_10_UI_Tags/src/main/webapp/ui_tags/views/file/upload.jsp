<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<s:head />
	</head>
	<body>
		<h1>File upload demo</h1>
		<s:form action="fileAction" namespace="/ui_tags" method="POST" enctype="multipart/form-data">
		<s:file name="uploadFile" label="Select a File" size="40" />
		<s:submit value="submit" name="submit" />
		</s:form>
		
		<h1>Multiple files upload</h1>
			<s:form action="multipleFileAction" namespace="/ui_tags" method="POST" enctype="multipart/form-data">
			<s:file label="File 1" name="multipleFileUpload" size="40" />
			<s:file label="File 2" name="multipleFileUpload" size="40" />
			<s:file label="FIle 2" name="multipleFileUpload" size="40" />
			
			<s:submit value="submit" name="submit" />
		</s:form>
	</body>
</html>
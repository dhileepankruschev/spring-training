<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

<body>
	<h1>File uploaded successfully</h1>
		<div>File Name : <s:property value="fileName" /></div>
		<div>Content Type : <s:property value="uploadFileContentType" /></div>
		<div>File Path: <s:property value="uploadFile" /></div>
		<hr/>
		<s:url id="fileDownload" namespace="/ui_tags" action="downloadFile" ></s:url>
		<h2>Download uploaded file - <s:a href="%{fileDownload}">Abc.txt</s:a>
</body>
</html>
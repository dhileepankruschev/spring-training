<%@ page language="java"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
	<title>Struts2 Stream Result</title>
</head>
<body>
<h1>Stream Result Example</h1>
	<s:form action="EmployeeResult" method="post">
		<s:submit value="GeneratePdf" name="submit" />
	</s:form>
</body>
</html>
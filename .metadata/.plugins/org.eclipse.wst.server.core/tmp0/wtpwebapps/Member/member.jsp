<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg}
<br>
${m.name }

<form method="POST" action="adduser">
<input type=text name="name" placeholder="Enter name"/>
<input type=text name="salary" placeholder="Enter salary"/>
<input type=submit value="Register Member"/>
</form>

</body>
</html>
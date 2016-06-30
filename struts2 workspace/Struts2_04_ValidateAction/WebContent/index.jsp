<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<s:head />
<title>More in Action class</title>

</head>
<body>
<h2>Employee Registration</h2>
<s:actionmessage/>
<s:actionerror />
<%-- <s:fielderror /> --%>
<s:form action="EmployeeAction" method="post">
<s:textfield label="Enter Code" name="code" />
<s:textfield label="Enter Name" name="name" />
<s:textfield label="Enter City" name="city" />
<s:textfield label="Enter Salary" name="salary" value="0" />
<s:submit label="Submit" />
<s:reset label="Reset" />
</s:form>
<hr>
Default action demo :
<br/><a href="UnknownAction.action">Unknown Action</a>
<br/><a href="abc">Unknown Action</a>
<br/><a href="a/b/c/hello.html">Unknown Link (404 as looking for html file, uncomment &lt;error-page&gt; in web.xml)</a>
</body>
</html>

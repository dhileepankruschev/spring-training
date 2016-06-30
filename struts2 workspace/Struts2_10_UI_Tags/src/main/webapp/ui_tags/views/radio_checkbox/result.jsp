<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<body>
<h1>Struts 2 radio button example</h1>

<h2>
  Your Gender is : <s:property value="selectedGender"/>
</h2> 
<h2>
  Your Language is  : <s:property value="selectedLanguage"/>
</h2> 
<h2>
  You are : <s:property value="maritalStatus"/>
</h2> 
<h2>
  CheckBox (SelectMe) value : <s:property value="selectMe"/>
</h2> 
<h2>
  Selected colors : <s:property value="yourColor"/>
</h2> 
<h2>
  Favorite Food : <s:property value="yourFood"/>
</h2> 


</body>
</html>
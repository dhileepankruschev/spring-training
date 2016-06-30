<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>

<body>
<h1>Struts 2 radio button example</h1>

<s:form action="radio_check" namespace="/ui_tags">

<h2>
	<s:radio label="Gender" name="selectedGender" list="genders" />
	<s:radio label="Country" name="selectedLanguage" list="countries" listKey="name" listValue="language" />
	<s:radio label="Marital Status" name="maritalStatus" list="#{'Single':'Single','Married':'Married','Separated':'Separated','Divorced':'Divorced'}" value="Single" />
	<br/>
	<s:checkbox name="selectMe" fieldValue="true" label="Select Me"/>
	<s:checkboxlist label="What's your favor color" list="colors" name="yourColor" value="defaultColor" />
	
	<s:select label="What's your favorite food" 
		headerKey="-1" headerValue="Select Food"
		list="foods" 
		name="yourFood"/>
</h2> 
<s:submit value="submit" name="submit" />
	
</s:form>

</body>
</html>
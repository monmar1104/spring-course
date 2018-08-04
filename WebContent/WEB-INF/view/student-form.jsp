<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

First name: <form:input path="firstName"/>
<br><br>
LastName: <form:input path="lastName"/>
<br><br>

Country: 
<form:select path="country">

	<form:options items="${student.countryList}"/>

</form:select>

<br><br>
Favorite language:
<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguages}"/>


<%-- Java <form:radiobutton path="favoriteLanguage" value="Java"/>
PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
Phyton <form:radiobutton path="favoriteLanguage" value="Phyton"/>
 --%>
<br><br>
<form:checkboxes items="${student.operatingSystems}" path="operatingSystems"/>

<br><br>
<input type="submit" value="Submit"/>




</form:form>


</body>
</html>
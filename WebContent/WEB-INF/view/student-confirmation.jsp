<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student confirmation</title>
</head>
<body>
	The student is confirmed: ${student.firstName} ${student.lastName} from ${student.country}
	<br>
	His favorite programming language is: ${student.favoriteLanguage}
	<br>
	Operating system: 
	<ul>
	<c:forEach var="os" items="${student.operatingSystems}">
	<li>${os}</li>
	</c:forEach>
	</ul>
	
	
</body>
</html>
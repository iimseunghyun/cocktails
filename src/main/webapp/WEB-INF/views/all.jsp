<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>all page</h1>

<sec:authorize access="isAnonymous()"> 

	<a href = "/customSignIn">Sign In</a>

</sec:authorize>


<sec:authorize access = "isAuthenticated()">

	<a href = "/customSignOut">Sign Out</a>

</sec:authorize>


</body>
</html>
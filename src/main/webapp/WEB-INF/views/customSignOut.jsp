<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>SignOut Page</h1>
<form action="/customSignOut" method = "post">
<input type = "hidden" name = "${_csrf.parameterName }" value = "${_csrf.token }" />
<button>Sign Out</button>
</form>
</body>
</html>
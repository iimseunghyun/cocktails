<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv= "Content-Type" content = "text/html" charset= "UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>admin page</h1>

<p>principal : <sec:authentication property = "principal"/> </p>
<p>MemberVO : <sec:authentication property = "principal.member"/></p>
<p>사용자 이름: <sec:authentication property = "principal.member.name"/></p>
<p>사용자 아이디: <sec:authentication property = "principal.member.id"/></p>
<p>사용자 권한 리스트 : <sec:authentication property = "principal.member.authList"/></p>



<a href = "/customSignOut">Sign Out</a>

</body>
</html>
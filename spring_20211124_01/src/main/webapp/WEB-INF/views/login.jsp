<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>login.jsp</h2>
	<!--  Controller에서 가져온 MemberDTO 객체 출력 -->
	
		${member.id}
		${member.pw}
		${member.name}
		${member.email}
		${member.gender}
</body>
</html>
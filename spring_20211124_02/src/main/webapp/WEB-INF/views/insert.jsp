<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2> insert</h2>
	<form action="insert" method="post">
	이름 : <input type="text" name="t_name">
	나이 : <input type="text" name="t_age">
	전화번호 : <input type="text" name="t_phone">
	남 : <input type="radio" name="t_gender" value="남">
	여 : <input type="radio" name="t_gender" value="여">
	생년월일 : <input type="date" name="t_birthday">
	집주소 : <input type="text" name="t_home">
	<input type="submit" value="가입">
	</form>

</body>
</html>
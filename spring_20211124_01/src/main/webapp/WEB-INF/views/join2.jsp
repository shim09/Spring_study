<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	input {
		display: block
	}
</style>
</head>
<body>
	<h2>회원 가입</h2>
	<form action="join2" method="post">
	ID : <input  type="text" name="id">
	PW : <input  type="password" name="pw">
	이름 :<input  type="name" name="name">
	이메일 :<input  type="email" name="email">
	남 : <input type="radio" name="gender" value="남"> 여 : <input type="radio" name="gender" value="여"> 
	<input type="submit" value="가입">
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인사관리시스템</title>
<style>
input {
	width: 100px;
	height: 50px;
	margin: 10px 10px;
}
fieldset {
	width: 400px;
}
</style>
</head>
<body>
	<h2>인사관리 시스템</h2>
	<fieldset>
		<legend>인사관리 메인메뉴</legend>
		<input type="button" value="조회" onclick="location.href=''">
		<input type="button" value="사원등록" onclick="">
		<input type="button" value="정보 변경" onclick="">
		<br>
		<input type="button" value="퇴사처리" onclick="">
		<input type="button" value="종료" onclick="window.close();">
	</fieldset>
</body>
</html>
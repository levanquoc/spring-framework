<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
		integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
		crossorigin="anonymous">
	<div class="alert alert-danger" role="alert">${msg}</div>
	<form action="${pageContext.request.contextPath}/login" method=post>
		<h2>Login</h2>
		Username: <input type="text" name="username" value=""><br>
		Password: <input type="password" name="password" value=""><br>
		<input type="submit" name="submit" value="Login">
	</form>
</body>
</html>
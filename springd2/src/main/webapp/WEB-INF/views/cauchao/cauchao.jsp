<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>In cau chao</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/cauchao" method="post">
		<h2>In cau chao</h2>
		Nhập tên: <input type="text" name="name" value="${name}"><br>
		Câu chào: 
		 Xin chào ${name} <br> <input type="submit" name="submit"
			value="In ra cau chao"> 
	</form>

</body>
</html>
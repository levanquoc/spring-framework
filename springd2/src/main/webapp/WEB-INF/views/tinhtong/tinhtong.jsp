<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tính tổng</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/tinhtong" method="post">
		<h2>Tính tổng</h2>
		Dãy số: <input type="text" name="dayso" value="${dayso}"><br>
		Tổng: <input type="text" name="tong" value="${sum}"><br>
		 <input type="submit" name="submit"
			value="Tính tổng"> 
	</form>

</body>
</html>
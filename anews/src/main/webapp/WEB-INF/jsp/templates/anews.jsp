<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/components/taglib.jsp"%>
<c:url value="/resources/anews" var="contextPath" scope="application" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>VinaENTER EDU - Đã học là làm được</title>
	<meta name="description" content="VinaENTER EDU đào tạo lập trình viên chuyên nghiệp - Đã học là làm được">
	<meta name="keywords" content="dao tao chuyên sâu lap trinh php, java">
	<link href="${contextPath}/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="wrapper">
	<tiles:insertAttribute name="header"></tiles:insertAttribute>
		
		<!-- end content -->
		<div id="content">
			<tiles:insertAttribute name="leftbar"></tiles:insertAttribute>
			<tiles:insertAttribute name="content"></tiles:insertAttribute>
		
		<tiles:insertAttribute name="footer"></tiles:insertAttribute>
	</div>
</body>
</html>
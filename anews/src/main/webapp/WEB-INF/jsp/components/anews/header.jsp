<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/components/taglib.jsp"%>
<c:url value="/resources/anews" var="contextPath" scope="application" />

	<!-- begin header -->
		<div id="header">
			<div class="header-left fl">
				<a href="${pageContext.request.contextPath}/anews/home" title=""><img src="${contextPath}/images/logo_edu.png" alt="" height="128px" /></a>
			</div>
			<div class="header-right fr">
				<a href="${pageContext.request.contextPath}/anews/home" title=""><img src="${contextPath}/images/banner.jpg" alt="" /></a>
			</div>
			<div class="clr"></div>
		</div>
		<!-- end header -->
		
		<!-- begin menu -->
		<div id="menu">
			<ul>
				<li class="active"><a href="${pageContext.request.contextPath}/anews/home" title="">Trang chủ</a></li>
			</ul>
			<div class="clr"></div>
		</div>
		<!-- end menu -->
		

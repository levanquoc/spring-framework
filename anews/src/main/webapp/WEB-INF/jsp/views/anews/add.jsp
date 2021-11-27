<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/components/taglib.jsp"%>
<c:url value="/resources/blog" var="contextPath" scope="application" />
<div id="content">

	<div class="content-right fr">
		<h3>Thêm tin</h3>
		<div class="main-content">
			<form action="" method="post">
				Tên tin: <input type="text" name="tentin" value="" /><br />
				<br /> Mô tả:
				<textarea rows="3" cols="20"></textarea>
				<br />
				<br /> Hình ảnh: <input type="file" name="hinhanh" value="" /><br />
				<br /> <input type="submit" name="submit" value="Thêm" /><br />
				<br />
			</form>
		</div>
	</div>
	<div class="clr"></div>
</div>
<!-- end content -->
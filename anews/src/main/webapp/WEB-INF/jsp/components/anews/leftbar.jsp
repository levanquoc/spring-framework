<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/components/taglib.jsp"%>
<c:url value="/resources/blog" var="contextPath" scope="application" />
<div class="content-left fl">
	<h3>Danh mục tin</h3>
	<ul>
		<c:choose>
			<c:when test="${not empty listCat}">
				<c:forEach items="${listCat }" var="item">
					<li><a href="cat.php" title="">${item.name}</a></li>
					
				</c:forEach>

			</c:when>
		</c:choose>
	</ul>
</div>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/components/taglib.jsp"%>

<div class="row tm-row">
	<div class="col-12">
		<form method="GET" class="form-inline tm-mb-80 tm-search-form">
			<input class="form-control tm-search-input" name="query" type="text"
				placeholder="Search..." aria-label="Search">
			<button class="tm-search-button" type="submit">
				<i class="fas fa-search tm-search-icon" aria-hidden="true"></i>
			</button>
		</form>
	</div>
</div>

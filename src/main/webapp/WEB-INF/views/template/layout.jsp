<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- tiles framework 선언부 --%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/reset.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/common.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
<!-- title -->
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>

<body>
<section id="container">
	<!-- Tiles header 영역 -->
	<tiles:insertAttribute name="header" />
	<!-- Tiles main 영역 -->
	<tiles:insertAttribute name="main" />
	<!-- Tiles main 영역 -->
	<tiles:insertAttribute name="footer" />
</section>

<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="${pageContext.request.contextPath}/js/main.js"></script>
</body>

</html>

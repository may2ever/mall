<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import = "cafe.jjdev.mall.service.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br>
	Hello ${model}
	<br>
	<c:if test="${member.level == 0}">
		일반고객
	</c:if>
	<c:if test="${member.level == 1}">
		관리자
	</c:if>
	<c:forEach var="str" items="${list}">
		<div>${str}</div>
	</c:forEach>
</body>
</html>
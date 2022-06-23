<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${path}/resources/css/main.css">
<title>영화 상영 페이지</title>
</head>
<body>
    <div id="header">
        헤더영역
    </div>
    <div id="contents">
        <iframe width="100%" height="800px" src="https://www.youtube.com/embed/0zjDQe4LnAA?rel=0&modestbranding=1&color=white" allowfullscreen></iframe>
    </div>
    <div id="footer">
        푸터영역
    </div>
</body>
</html>
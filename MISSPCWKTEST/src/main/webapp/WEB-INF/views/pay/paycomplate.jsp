<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"  type="text/css" href="${path}/resources/css/paycom.css">

<title>Insert title here</title>
</head>
<body>
	<header>MISS</header>
    <hr/>
    
    <h2>결제가 완료되었습니다.</h2>

    <div id = "post">
        <img src="${path}/resources/img/witch.jpeg">
    </div>

    <div id = "movie_comimp">

        <div id = "qua_age">
            <div id = "quality">화질</div>
            <div id = "age_limit">연령제한</div>
        </div>

        <div >
            <div id = "movie_title">영화제목</div>
            <div id = "w_time">관람 시간</div>
            <div id = "pay_num">결제번호</div>
            <div id = "precaution">주의사항</div>

        </div>
        
        
    </div>

    <div>
        <button type="button"> 
            예매내역 확인
        </button>
    </div>
</body>
</html>
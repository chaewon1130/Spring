<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"  type="text/css" href="${path}/resources/css/paypage.css">
<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
 <script src="${path}/resources/js/jquery-1.12.4.js"></script>

	<title>Miss</title>
</head>
<body>
<<header>
        <h1>MISS</h1>
    </header>
    <hr>

    <div id = "movie_sale">
        <div id = "movie_detail" >
            <div class="movie_imp">
                <div id = "c_movie">선택한 영화정보</div>
                <div id = "t_movie">영화제목/상영시간 등</div>
            </div>
            <div class="movie_sale">
                <div id = "p_price">결제금액</div>
                <div id = "coupon">할인쿠폰</div>
                <div id = "point">포인트</div>
                <div id = "result_pay">최종결제금액</div>
            </div>
            
        </div>
    </div>

    <div id = "payment_type">
    	<form method = "post" action="/miss/pay/kakaoPay.do">
   			 <button id="kakaoapibtn"><img src="${path}/resources/img/kakao.jpeg"></button>
		</form>
    	
        <button id = "naverapibtn"  type="button">네이버 간편 결제</button>
    </div>
    
    
    <script src="${path}/resources/js/kakaobtn.js" type = "text/javascript"></script>
    <script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
</body>
</html>

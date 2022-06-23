<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${path}/resources/css/main.css">
<title>MISS 메인화면</title>
</head>
<body>
    <div id="header">
        헤더영역
    </div>
    <div id="contents">
        <div id="status">
            <h1>현재 상영중</h1>
        </div>
        <div id="slideshow1">
            <ul class="slides1">
                <li>
                    <img src="${path}/resources/img/mov1.jpg">
                    <div class="movie1">
                        <h3>마녀</h3>
                    </div>
                    <div class="caption1">
                        <h1>마녀</h1><br><br>
                        <h2>배우</h2>
                        <p>~~~~~~</p><br>
                        <h2>상영시간</h2>
                        <p>09:00 10:00</p>
                        <p>11:00 12:00</p><br>
                        <h2>런닝타임</h2>
                        <p>120분</p>
                    </div>
                </li>
                <li>
                    <img src="${path}/resources/img/mov2.jpg">
                    <div class="movie1">
                        <h3>마녀</h3>
                    </div>
                    <div class="caption1">
                        <h1>마녀</h1><br><br>
                        <h2>배우</h2>
                        <p>~~~~~~</p><br>
                        <h2>상영시간</h2>
                        <p>09:00 10:00</p>
                        <p>11:00 12:00</p><br>
                        <h2>런닝타임</h2>
                        <p>120분</p>
                    </div>
                </li>
                <li>
                    <img src="${path}/resources/img/mov3.jpg">
                    <div class="movie1">
                        <h3>마녀</h3>
                    </div>
                    <div class="caption1">
                        <h1>마녀</h1><br><br>
                        <h2>배우</h2>
                        <p>~~~~~~</p><br>
                        <h2>상영시간</h2>
                        <p>09:00 10:00</p>
                        <p>11:00 12:00</p><br>
                        <h2>런닝타임</h2>
                        <p>120분</p>
                    </div>
                </li>
                <li>
                    <img src="${path}/resources/img/mov4.jpg">
                    <div class="movie1">
                        <h3>마녀</h3>
                    </div>
                    <div class="caption1">
                        <h1>마녀</h1><br><br>
                        <h2>배우</h2>
                        <p>~~~~~~</p><br>
                        <h2>상영시간</h2>
                        <p>09:00 10:00</p>
                        <p>11:00 12:00</p><br>
                        <h2>런닝타임</h2>
                        <p>120분</p>
                    </div>
                </li>
                <li>
                    <img src="${path}/resources/img/mov5.jpg">
                    <div class="movie1">
                        <h3>마녀</h3>
                    </div>
                    <div class="caption1">
                        <h1>마녀</h1><br><br>
                        <h2>배우</h2>
                        <p>~~~~~~</p><br>
                        <h2>상영시간</h2>
                        <p>09:00 10:00</p>
                        <p>11:00 12:00</p><br>
                        <h2>런닝타임</h2>
                        <p>120분</p>
                    </div>
                </li>
                <li>
                    <img src="${path}/resources/img/mov6.jpg">
                    <div class="movie1">
                        <h3>마녀</h3>
                    </div>
                    <div class="caption1">
                        <h1>마녀</h1><br><br>
                        <h2>배우</h2>
                        <p>~~~~~~</p><br>
                        <h2>상영시간</h2>
                        <p>09:00 10:00</p>
                        <p>11:00 12:00</p><br>
                        <h2>런닝타임</h2>
                        <p>120분</p>
                    </div>
                </li>
                <li>
                    <img src="${path}/resources/img/mov7.jpg">
                    <div class="movie1">
                        <h3>마녀</h3>
                    </div>
                    <div class="caption1">
                        <h1>마녀</h1><br><br>
                        <h2>배우</h2>
                        <p>~~~~~~</p><br>
                        <h2>상영시간</h2>
                        <p>09:00 10:00</p>
                        <p>11:00 12:00</p><br>
                        <h2>런닝타임</h2>
                        <p>120분</p>
                    </div>
                </li>
                <li>
                    <img src="${path}/resources/img/mov8.jpg">
                    <div class="movie1">
                        <h3>마녀</h3>
                    </div>
                    <div class="caption1">
                        <h1>마녀</h1><br><br>
                        <h2>배우</h2>
                        <p>~~~~~~</p><br>
                        <h2>상영시간</h2>
                        <p>09:00 10:00</p>
                        <p>11:00 12:00</p><br>
                        <h2>런닝타임</h2>
                        <p>120분</p>
                    </div>
                </li>
            </ul>
            <p class="controller">
                <span class="prev" id="prev1">&lang;</span>
                <span class="next" id="next1">&rang;</span>
            </p>
        </div>
        <div id="slideshow2">
            <div id="status">
                <h1>상영 임박</h1>
            </div>
            <div id="movie2">
                <div id="slideshow2">
                    <ul class="slides2">
                        <li>
                            <img src="${path}/resources/img/mov1.jpg">
                            <div class="caption2">
                                <h1>마녀</h1>
                                <h3>09:00</h3>
                            </div>
                        </li>
                        <li>
                            <img src="${path}/resources/img/mov4.jpg">
                            <div class="caption2">
                                <h1>마녀</h1>
                                <h3>09:00</h3>
                            </div>
                        </li>
                        <li>
                            <img src="${path}/resources/img/mov1.jpg">
                            <div class="caption2">
                                <h1>마녀</h1>
                                <h3>09:00</h3>
                            </div>
                        </li>
                        <li>
                            <img src="${path}/resources/img/mov5.jpg">
                            <div class="caption2">
                                <h1>마녀</h1>
                                <h3>09:00</h3>
                            </div>
                        </li>
                        <li>
                            <img src="${path}/resources/img/mov2.jpg">
                            <div class="caption2">
                                <h1>마녀</h1>
                                <h3>09:00</h3>
                            </div>
                        </li>
                        <li>
                            <img src="${path}/resources/img/mov4.jpg">
                            <div class="caption2">
                                <h1>마녀</h1>
                                <h3>09:00</h3>
                            </div>
                        </li>
                        <li>
                            <img src="${path}/resources/img/mov1.jpg">
                            <div class="caption2">
                                <h1>마녀</h1>
                                <h3>09:00</h3>
                            </div>
                        </li>
                        <li>
                            <img src="${path}/resources/img/mov3.jpg">
                            <div class="caption2">
                                <h1>마녀</h1>
                                <h3>09:00</h3>
                            </div>
                        </li>
                    </ul>
                    <p class="controller">
                        <span class="prev" id="prev2">&lang;</span>
                        <span class="next" id="next2">&rang;</span>
                    </p>
                </div>
            </div>
        </div>
    </div>
    <div id="footer">
        푸터영역
    </div>
    <script src="${path}/resources/js/main.js"></script>
</body>
</html>
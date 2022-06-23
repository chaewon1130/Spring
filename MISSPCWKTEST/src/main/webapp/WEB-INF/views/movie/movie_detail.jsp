<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${path}/resources/css/movie_detail.css">
<title>MISS 영화 상세 화면</title>
</head>
<body>
	<div id="header">
        헤더영역
    </div>
    <div id="contents">
        <div id="left">
            <div id="poster">
                <img src="${path}/resources/img/mov1.jpg">
            </div>
            <div id="stat">
                <!-- 통계영역(별점, 예매율, 연령별예매분포) -->
                <h3>별점 : 9.3</h3>
                <h3>예매율 : 26%</h3>
                <canvas id="chart" width="" height="150"></canvas>
            </div>
        </div>
        <div id="right">
            <input type="button" value="예매하기">
            <div id="detail">
                <h1>마녀 Part2. The Other One</h1><br>
                <p>감독 : 박훈정</p><br>
                <p>배우 : 신시아, 서은수, 진구</p><br>
                <p>장르 : 액션</p><br>
                <p>15세 이상 관람가</p><br>
                <p>러닝타임 : 137분</p><br>
                <p>국내영화</p><br>
                <p>2022.06.15 개봉</p><br>
                <p>통제불능의 존재가 세상 밖으로 나왔다!<br>
                ‘자윤’이 사라진 뒤, 정체불명의 집단의 무차별 습격으로 마녀 프로젝트가 진행되고 있는 ‘아크’가 초토화된다.
                그곳에서 홀로 살아남은 ‘소녀’는 생애 처음 세상 밖으로 발을 내딛고
                우연히 만난 ‘경희’의 도움으로 농장에서 지내며 따뜻한 일상에 적응해간다.
                한편, ‘소녀’가 망실되자 행방을 쫓는 책임자 ‘장’과
                마녀 프로젝트의 창시자 ‘백총괄’의 지령을 받고 제거에 나선 본사 요원 ‘조현’,
                ‘경희’의 농장 소유권을 노리는 조직의 보스 ‘용두’와
                상해에서 온 의문의 4인방까지
                각기 다른 목적을 지닌 세력이 하나 둘 모여들기 시작하면서 ‘소녀’ 안에 숨겨진 본성이 깨어나는데…<br>
                모든 것의 시작,
                더욱 거대하고 강력해진 마녀가 온다.</p>
            </div>
            
            <div id="moviecut">
                <div id="movie">
                    <div id="slideshow">
                        <ul class="slides">
                            <li>
                                <img src="${path}/resources/img/cut1.jpg">
                            </li>
                            <li>
                                <img src="${path}/resources/img/cut2.jpg">
                            </li>
                            <li>
                                <img src="${path}/resources/img/cut3.jpg">
                            </li>
                            <li>
                                <img src="${path}/resources/img/cut4.jpg">
                            </li>
                        </ul>
                        <p class="controller">
                            <span class="prev" id="prev">&lang;</span>
                            <span class="next" id="next">&rang;</span>
                        </p>
                    </div>
                </div>
            </div>
            
            <div id="review">
                <form action="#" method="get">
                    <select>
                        <option selected>5</option>
                        <option>4</option>
                        <option>3</option>
                        <option>2</option>
                        <option>1</option>
                    </select>
                    <input type="text" placeholder="리뷰를 입력하세요(50자 이내)">
                    <input type="submit" value="작성완료">
                </form>
                <table>
                    <tr>
                        <th>순번</th>
                        <th>닉네임</th>
                        <th>한줄평</th>
                        <th>별점</th>
                        <th>좋아요</th>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>리뷰왕</td>
                        <td>너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요</td>
                        <td>5</td>
                        <td class="like1 on"><img src="${path}/resources/img/like.JPG"></td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>리뷰왕</td>
                        <td>너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요</td>
                        <td>5</td>
                        <td class="like2 on"><img src="${path}/resources/img/like.JPG"></td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>리뷰왕</td>
                        <td>너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요</td>
                        <td>5</td>
                        <td id="like12" class="on"><img src="${path}/resources/img/like.JPG"></td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>리뷰왕</td>
                        <td>너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요</td>
                        <td>5</td>
                        <td id="like12" class="on"><img src="${path}/resources/img/like.JPG"></td>
                    </tr>
                    <tr>
                        <td>5</td>
                        <td>리뷰왕</td>
                        <td>너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요너무재밌어요</td>
                        <td>5</td>
                        <td id="like21" class="on"><img src="${path}/resources/img/like.JPG"></td>
                    </tr>
                </table><br>
                <div style="text-align: center; word-spacing: 30px;"><< < 1 2 3 4 5 > >></div>
            </div>
        </div>
    </div>
    <div id="footer">
        푸터영역
    </div>
    <script src="${path}/resources/js/movie_detail.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js"></script>
</body>
</html>
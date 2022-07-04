<%--
/**
	Class Name: header.jsp
	Description: header
	Modification information
	
	수정일     수정자      수정내용
    -----   -----  -------------------------------------------
    2022. 7. 1.        최초작성 
    
    author eclass 개발팀
    since 2020.11.23
    Copyright (C) by KandJang All right reserved.
*/
 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="CP" value="${pageContext.request.contextPath}"/>
<c:set var="resources" value="/resources"/>
<c:set var="CP_RES" value="${CP}${resources}"/>
<style>
    .pHeader{
        background: #e3f2fd;
    }
</style>
<!-- header -->
<div id="header" class="pHeader">
    <!-- nav -->
    <nav class="navbar navbar-default">
	    <div class="container-fluid">
	       <!-- brand -->
	       <div class="navbar-header">
		      <a class="navbar-brand" href="#">
		        <img alt="Brand" src="${CP_RES}/imgs/brand.png" width="60%">
		      </a>
		   </div>
           <!-- //brand ------------------------------------->
            <ol class="breadcrumb text-left">
	          <li><a href="${CP}/user/userView.do">회원관리</a></li>
	          <li><a href="${CP}/chart/levelPerMemberCntView.do">레벨별 인원수</a></li>
	          <li><a href="${CP}/chart/pieView.do">PIE차트</a></li>
	          <li><a href="${CP}/chart/lineView.do">LINE차트</a></li>
	          <li class="active"><a href="${CP}/board/boardView.do?div=10">공지사항</a></li>
	          <li class="active"><a href="${CP}/board/boardView.do?div=20">자유게시판</a></li>
	          <li class="active"><a href="${CP}/naverBlog/naverBlogView.do">네이버 블로그</a></li>
	          
	          <c:choose>
                <c:when test="${sessionScope.user != null}">
                    <li class="active navbar-right">
                        <a href="javascript:doLogout();">
		                    <span>${sessionScope.user.name}님</span>
		                    <span class="glyphicon glyphicon-log-out">&nbsp;로그아웃</span>
	                    </a>
                    </li>
                </c:when>
                <c:otherwise>
                    <li class="active navbar-right">
                        <a href="${CP}/login/loginView.do"><span class="glyphicon glyphicon-log-in">&nbsp;로그인</span></a>
                    </li>
                </c:otherwise>
	          </c:choose>
	        </ol>
        </div>
    </nav>
    <!-- //nav ------------------------------------------->
</div>
<!-- //header--------------------------------------------->
<script type="text/javascript">
    function doLogout(){
    	if(confirm("로그아웃하시겠습니까?") == false){
    		return;
    	}
    	window.location.href = "${CP}/login/doLogout.do";
    }
</script>
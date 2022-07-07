/**
* <pre>
* com.pcwk.ehr.interceptor
* Class Name : LoginInterceptor.java
* Description: 로그인이 필요한 페이지에 session이 없으면 로그인 페이지로 이동
* Author: ITSC
* Since: 2022/07/06
* Version 0.1
* Copyright (C) by KandJang All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/07/06 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ehr.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author ITSC
 *
 */
@SuppressWarnings("deprecation")
public class LoginInterceptor extends HandlerInterceptorAdapter {

	final Logger LOG = LogManager.getLogger(this.getClass());
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		//session이 없으면 로그인 페이지로 이동
		HttpSession session = request.getSession();
		
		//session 정보를 추출
		Object obj = session.getAttribute("user");
		LOG.debug("obj : " + obj);
		if(obj == null) {
			
			LOG.debug("request.getContextPath() : " + request.getContextPath());
			//로그인 화면으로 이동
			response.sendRedirect(request.getContextPath() + "/login/loginView.do");
			
			//더이상 컨트롤러 요청으로 가지 않도록 false
			return false;
		}
		
		//컨트롤러 uri로 이동
		return true;
	}
	
}

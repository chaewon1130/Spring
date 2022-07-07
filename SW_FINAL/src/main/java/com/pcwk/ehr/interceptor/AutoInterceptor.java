/**
* <pre>
* com.pcwk.ehr.interceptor
* Class Name : AutoInterceptor.java
* Description:
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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author ITSC
 *
 */
@SuppressWarnings("deprecation")
public class AutoInterceptor extends HandlerInterceptorAdapter {
	final Logger LOG = LogManager.getLogger(this.getClass());

	//컨트롤러가 호출되기 전에 실행
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		LOG.debug("=====================================");
		LOG.debug("=1. preHandle=컨트롤러가 호출되기 전에 실행====");
		LOG.debug("=====================================");
		return super.preHandle(request, response, handler);
	}

	//컨트롤러가 실행된 후에 호출
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		LOG.debug("=====================================");
		LOG.debug("=2. postHandle=컨트롤러가 실행된 후에 호출=====");
		LOG.debug("=====================================");
		super.postHandle(request, response, handler, modelAndView);
	}

	//뷰에서 최종 결과가 생성하는 일을 포함한 모든 일이 완료 되었을때 실행
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		LOG.debug("=====================================");
		LOG.debug("=3. afterCompletion=뷰에서 최종 결과가 생성하는 일을 포함한 모든 일이 완료 되었을때 실행=");
		LOG.debug("=====================================");
		super.afterCompletion(request, response, handler, ex);
	}
	
	
}

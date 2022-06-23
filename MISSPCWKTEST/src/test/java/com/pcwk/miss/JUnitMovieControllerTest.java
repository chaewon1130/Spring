/**
* <pre>
* com.pcwk.miss
* Class Name : JUnitMovieControllerTest.java
* Description:
* Author: ITSC
* Since: 2022/06/23
* Version 0.1
* Copyright (C) by KandJang All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/06/23 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.miss;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.google.gson.Gson;
import com.pcwk.miss.domain.MovieVO;
import com.pcwk.miss.movie.dao.MovieDao;

/**
 * @author ITSC
 *
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class) // JUnit기능을 스프링 프레임으로 확장
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml",
								   "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"}) // applicationContext.xml loading
public class JUnitMovieControllerTest {

	final Logger LOG = LogManager.getLogger(this.getClass());
	
	@Autowired
	WebApplicationContext webApplicationContext;

	// 브라우저 대역(Mock)
	MockMvc mockMvc;
	
	@Autowired
	MovieDao dao;
	MovieVO movie01;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		LOG.debug("========================");
		LOG.debug("=0.setUp()=");
		LOG.debug("========================");
		
		movie01 = new MovieVO(1, "AA", "BB", "CC", "DD", "20220623", 15, "EE", 1, 120);
		
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		LOG.debug("webApplicationContext : " + webApplicationContext);
		LOG.debug("mockMvc : " + mockMvc);
		
		assertNotNull(webApplicationContext);
		assertNotNull(mockMvc);
	}

	public MovieVO doSelectOne(MovieVO movie) throws Exception {
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/movie/doSelectOne.do")
				.param("mvNum", String.valueOf(movie.getMvNum()));
		ResultActions resultActions = mockMvc.perform(requestBuilder)
				.andExpect(status().isOk());
		
		String result = resultActions.andDo(print())
				.andReturn()
				.getResponse().getContentAsString();
		LOG.debug("========================");
		LOG.debug("result : " + result);
		LOG.debug("========================");
		
		Gson gson = new Gson();
		// gson String to UserVO
		MovieVO outVO = gson.fromJson(result, MovieVO.class);
		
		return outVO;
	}
	
	@Test
	public void test() throws Exception {
		
		MovieVO outVO = doSelectOne(movie01);
		LOG.debug(outVO);
	}

}

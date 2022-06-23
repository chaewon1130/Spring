/**
* <pre>
* com.pcwk.miss
* Class Name : JUnitMovieDaoTest.java
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

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pcwk.miss.domain.MovieVO;
import com.pcwk.miss.movie.dao.MovieDao;

/**
 * @author ITSC
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) // JUnit기능을 스프링 프레임으로 확장
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml",
									"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"}) // applicationContext.xml loading
public class JUnitMovieDaoTest {

	final Logger LOG = LogManager.getLogger(this.getClass());
	
	@Autowired //컨텍스트 프레임워크는 변수 타입과 일치하는 컨텍스트 내의 빈을 찾고, 변수에 주입
	ApplicationContext context;
	
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
		
		LOG.debug("context : " + context);
		LOG.debug("dao : " + dao);
		
		assertNotNull(context);
		assertNotNull(dao);
	}

	@Test
	public void doSelectOne() throws SQLException {
		MovieVO vsVO = dao.doSelectOne(movie01);
		LOG.debug(vsVO);
	}

}

/**
* <pre>
* com.pcwk.miss.movie.dao
* Class Name : MovieDaoImpl.java
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
package com.pcwk.miss.movie.dao;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pcwk.miss.domain.MovieVO;

/**
 * @author ITSC
 *
 */
@Repository("movieDao")
public class MovieDaoImpl implements MovieDao {

	final Logger LOG = LogManager.getLogger(this.getClass());
	
	// mybatis namespace
	final String NAMESPACE = "com.pcwk.miss.movie";
	
	// mybatis db연결객체
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public MovieDaoImpl() {
		
	}
	
	@Override
	public MovieVO doSelectOne(MovieVO inVO) throws SQLException {
		MovieVO outVO = null;
		
		String statement = this.NAMESPACE + ".doSelectOne";
		LOG.debug("============================");
		LOG.debug("param:" + inVO.toString());
		LOG.debug("statement:" + statement);
		LOG.debug("============================");
		
		outVO = this.sqlSessionTemplate.selectOne(statement, inVO);
		LOG.debug("============================");
		LOG.debug("**outVO=" + outVO.toString());
		LOG.debug("============================");
		
		return outVO;
	}
	
}

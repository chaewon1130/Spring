/**
* <pre>
* com.pcwk.miss.movie.service
* Class Name : MovieServiceImpl.java
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
package com.pcwk.miss.movie.service;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcwk.miss.domain.MovieVO;
import com.pcwk.miss.movie.dao.MovieDao;

/**
 * @author ITSC
 *
 */
@Service("movieService")
public class MovieServiceImpl implements MovieService {

	final Logger LOG = LogManager.getLogger(this.getClass());
	
	@Autowired
	private MovieDao movieDao;
	
	public MovieServiceImpl() {
		
	}
	
	@Override
	public MovieVO doSelectOne(MovieVO inVO) throws SQLException {
		return movieDao.doSelectOne(inVO);
	}

}

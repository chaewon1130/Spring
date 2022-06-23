/**
* <pre>
* com.pcwk.miss.movie.service
* Class Name : MovieService.java
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

import com.pcwk.miss.domain.MovieVO;

/**
 * @author ITSC
 *
 */
public interface MovieService {
	
	/**
	 * 단건조회
	 * @param inVO
	 * @return 1(성공) / 0(실패)
	 * @throws SQLException
	 */
	public MovieVO doSelectOne(MovieVO inVO) throws SQLException;
}

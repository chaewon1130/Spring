/**
* <pre>
* com.pcwk.ehr.cmn
* Class Name : LevelUpScheduler.java
* Description:
* Author: ITSC
* Since: 2022/07/07
* Version 0.1
* Copyright (C) by KandJang All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/07/07 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ehr.cmn;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.pcwk.ehr.user.domain.Level;
import com.pcwk.ehr.user.domain.UserVO;
import com.pcwk.ehr.user.service.UserService;

/**
 * @author ITSC
 *
 */
@Component
public class LevelUpScheduler {
	final Logger LOG = LogManager.getLogger(this.getClass());
	
	@Autowired
	UserService userService;
	
//	@Scheduled(cron = "0 0/1 * * * ?") //1분마다 1회 수행
//	public void runOneMinute() {
//		LOG.debug("*****************************");
//		LOG.debug("*runOneMinute()*");
//		LOG.debug("*****************************");
//	}
	
	@Scheduled(cron = "0 0/1 * * * ?") //1분마다 1회 수행
	public void levelUp() throws SQLException{
		LOG.debug("*****************************");
		LOG.debug("*levelUp()*");
		LOG.debug("*****************************");
		
		UserVO user01 = new UserVO("p03", "김동호03", "1130", Level.BASIC, 1, 0, "tubus1130@gmail.com", "날짜_사용안함");
		userService.upgradeLevels(user01);
		
	}
	
}
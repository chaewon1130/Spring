/**
* <pre>
* com.pcwk.ehr.chart.domain
* Class Name : LevelChartVO.java
* Description:
* Author: ITSC
* Since: 2022/07/04
* Version 0.1
* Copyright (C) by KandJang All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/07/04 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ehr.chart.domain;

import com.pcwk.ehr.cmn.DTO;

/**
 * @author ITSC
 *
 */
public class LevelChartVO extends DTO {
	private String levelName; //레벨명(BASIC,SILVER,GOLD)
	private int levelCount; //레벨별 인원수
	
	public LevelChartVO() {
		
	}

	public LevelChartVO(String levelName, int levelCount) {
		super();
		this.levelName = levelName;
		this.levelCount = levelCount;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public int getLevelCount() {
		return levelCount;
	}

	public void setLevelCount(int levelCount) {
		this.levelCount = levelCount;
	}

	@Override
	public String toString() {
		return "LevelChartVO [levelName=" + levelName + ", levelCount=" + levelCount + ", toString()="
				+ super.toString() + "]";
	}
	
}

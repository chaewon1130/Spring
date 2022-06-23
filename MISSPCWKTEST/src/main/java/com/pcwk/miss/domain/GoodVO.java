/**
* <pre>
* com.pcwk.miss.domain
* Class Name : TicketVO.java
* Description:
* Author: ITSC
* Since: 2022/06/20
* Version 0.1
* Copyright (C) by KandJang All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/06/20 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.miss.domain;

import com.pcwk.miss.cmn.DTO;

/**
 * @author ITSC
 *
 */
public class GoodVO extends DTO {
	public int rNum; //리뷰순번
	public int mbNum; //회원번호
	
	public GoodVO() {
		
	}

	public GoodVO(int rNum, int mbNum) {
		super();
		this.rNum = rNum;
		this.mbNum = mbNum;
	}

	public int getrNum() {
		return rNum;
	}

	public void setrNum(int rNum) {
		this.rNum = rNum;
	}

	public int getMbNum() {
		return mbNum;
	}

	public void setMbNum(int mbNum) {
		this.mbNum = mbNum;
	}

	@Override
	public String toString() {
		return "GoodVO [rNum=" + rNum + ", mbNum=" + mbNum + ", toString()=" + super.toString() + "]";
	}
	
}

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
public class ImageVO extends DTO {
	private int mvNum; //영화번호
	private int mvSeq; //영화순번
	private String imRoute; //파일경로
	
	public ImageVO() {
		
	}

	public ImageVO(int mvNum, int mvSeq, String imRoute) {
		super();
		this.mvNum = mvNum;
		this.mvSeq = mvSeq;
		this.imRoute = imRoute;
	}

	public int getMvNum() {
		return mvNum;
	}

	public void setMvNum(int mvNum) {
		this.mvNum = mvNum;
	}

	public int getMvSeq() {
		return mvSeq;
	}

	public void setMvSeq(int mvSeq) {
		this.mvSeq = mvSeq;
	}

	public String getImRoute() {
		return imRoute;
	}

	public void setImRoute(String imRoute) {
		this.imRoute = imRoute;
	}

	@Override
	public String toString() {
		return "ImageVO [mvNum=" + mvNum + ", mvSeq=" + mvSeq + ", imRoute=" + imRoute + ", toString()="
				+ super.toString() + "]";
	}
	
}

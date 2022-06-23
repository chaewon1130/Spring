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
public class TicketVO extends DTO {
	private int tNum; //결제번호
	private int mbNum; //회원번호
	private int tPrice; //결제금액
	private int tMeans; //결제수단(1 카드, 2카카오페이)
	private String tTime; //결제일시
	private int tStatus; //결제상태(0 취소, 1 결제완료)
	private int mvNum; //영화번호
	
	public TicketVO() {
		
	}

	public TicketVO(int tNum, int mbNum, int tPrice, int tMeans, String tTime, int tStatus, int mvNum) {
		super();
		this.tNum = tNum;
		this.mbNum = mbNum;
		this.tPrice = tPrice;
		this.tMeans = tMeans;
		this.tTime = tTime;
		this.tStatus = tStatus;
		this.mvNum = mvNum;
	}

	public int gettNum() {
		return tNum;
	}

	public void settNum(int tNum) {
		this.tNum = tNum;
	}

	public int getMbNum() {
		return mbNum;
	}

	public void setMbNum(int mbNum) {
		this.mbNum = mbNum;
	}

	public int gettPrice() {
		return tPrice;
	}

	public void settPrice(int tPrice) {
		this.tPrice = tPrice;
	}

	public int gettMeans() {
		return tMeans;
	}

	public void settMeans(int tMeans) {
		this.tMeans = tMeans;
	}

	public String gettTime() {
		return tTime;
	}

	public void settTime(String tTime) {
		this.tTime = tTime;
	}

	public int gettStatus() {
		return tStatus;
	}

	public void settStatus(int tStatus) {
		this.tStatus = tStatus;
	}

	public int getMvNum() {
		return mvNum;
	}

	public void setMvNum(int mvNum) {
		this.mvNum = mvNum;
	}

	@Override
	public String toString() {
		return "TicketVO [tNum=" + tNum + ", mbNum=" + mbNum + ", tPrice=" + tPrice + ", tMeans=" + tMeans + ", tTime="
				+ tTime + ", tStatus=" + tStatus + ", mvNum=" + mvNum + ", toString()=" + super.toString() + "]";
	}
	
}

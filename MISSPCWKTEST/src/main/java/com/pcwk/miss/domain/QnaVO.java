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
public class QnaVO extends DTO {
	private int qNum; //게시판순번
	private int qKind; //구분(1 공지, 2 일반글)
	private String qTitle; //제목
	private int qReadCnt; //조회수
	private String qContents; //내용
	private int mbNum; //등록자ID
	private String qDate; //작성일
	
	public QnaVO() {
		
	}

	public QnaVO(int qNum, int qKind, String qTitle, int qReadCnt, String qContents, int mbNum, String qDate) {
		super();
		this.qNum = qNum;
		this.qKind = qKind;
		this.qTitle = qTitle;
		this.qReadCnt = qReadCnt;
		this.qContents = qContents;
		this.mbNum = mbNum;
		this.qDate = qDate;
	}

	public int getqNum() {
		return qNum;
	}

	public void setqNum(int qNum) {
		this.qNum = qNum;
	}

	public int getqKind() {
		return qKind;
	}

	public void setqKind(int qKind) {
		this.qKind = qKind;
	}

	public String getqTitle() {
		return qTitle;
	}

	public void setqTitle(String qTitle) {
		this.qTitle = qTitle;
	}

	public int getqReadCnt() {
		return qReadCnt;
	}

	public void setqReadCnt(int qReadCnt) {
		this.qReadCnt = qReadCnt;
	}

	public String getqContents() {
		return qContents;
	}

	public void setqContents(String qContents) {
		this.qContents = qContents;
	}

	public int getMbNum() {
		return mbNum;
	}

	public void setMbNum(int mbNum) {
		this.mbNum = mbNum;
	}

	public String getqDate() {
		return qDate;
	}

	public void setqDate(String qDate) {
		this.qDate = qDate;
	}

	@Override
	public String toString() {
		return "QnaVO [qNum=" + qNum + ", qKind=" + qKind + ", qTitle=" + qTitle + ", qReadCnt=" + qReadCnt
				+ ", qContents=" + qContents + ", mbNum=" + mbNum + ", qDate=" + qDate + ", toString()="
				+ super.toString() + "]";
	}
}

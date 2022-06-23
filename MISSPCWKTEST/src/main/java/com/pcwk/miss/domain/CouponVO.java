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
public class CouponVO extends DTO {
	// 마이페이지에 표시되는 쿠폰순서는 사용종료일 기준으로 표시
	private int cNum; //쿠폰번호
	private int mbNum; //회원번호
	private String cName; //쿠폰이름
	private String cPeriod; //사용종료일
	private int cTarge; //쿠폰사용범위(1이면 생일쿠폰, 2이면 가입축하)
	private int cRatio; //할인율
	private int cKind; //사용구분(NOT NULL이면 TRUE)
	
	public CouponVO() {
		
	}

	public CouponVO(int cNum, int mbNum, String cName, String cPeriod, int cTarge, int cRatio, int cKind) {
		super();
		this.cNum = cNum;
		this.mbNum = mbNum;
		this.cName = cName;
		this.cPeriod = cPeriod;
		this.cTarge = cTarge;
		this.cRatio = cRatio;
		this.cKind = cKind;
	}

	public int getcNum() {
		return cNum;
	}

	public void setcNum(int cNum) {
		this.cNum = cNum;
	}

	public int getMbNum() {
		return mbNum;
	}

	public void setMbNum(int mbNum) {
		this.mbNum = mbNum;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcPeriod() {
		return cPeriod;
	}

	public void setcPeriod(String cPeriod) {
		this.cPeriod = cPeriod;
	}

	public int getcTarge() {
		return cTarge;
	}

	public void setcTarge(int cTarge) {
		this.cTarge = cTarge;
	}

	public int getcRatio() {
		return cRatio;
	}

	public void setcRatio(int cRatio) {
		this.cRatio = cRatio;
	}

	public int getcKind() {
		return cKind;
	}

	public void setcKind(int cKind) {
		this.cKind = cKind;
	}

	@Override
	public String toString() {
		return "CouponVO [cNum=" + cNum + ", mbNum=" + mbNum + ", cName=" + cName + ", cPeriod=" + cPeriod + ", cTarge="
				+ cTarge + ", cRatio=" + cRatio + ", cKind=" + cKind + ", toString()=" + super.toString() + "]";
	}
	
}

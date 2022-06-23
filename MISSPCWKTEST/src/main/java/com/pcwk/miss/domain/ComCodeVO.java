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
public class ComCodeVO extends DTO {
	// 마스터 코드 : 결제수단, 연령제한, 국가, 회원등급, 쿠폰적용대상, 게시판 구분
	private String mstCode; // 마스터코드
	private int detCode; // 상세코드
	private int codeSeq; // 코드순번
	private int codeUse; // 사용여부
	private String mstName; // 마스터코드이름
	private String detName; // 상세코드이름
	
	public ComCodeVO() {
		
	}

	public ComCodeVO(String mstCode, int detCode, int codeSeq, int codeUse, String mstName, String detName) {
		super();
		this.mstCode = mstCode;
		this.detCode = detCode;
		this.codeSeq = codeSeq;
		this.codeUse = codeUse;
		this.mstName = mstName;
		this.detName = detName;
	}

	public String getMstCode() {
		return mstCode;
	}

	public void setMstCode(String mstCode) {
		this.mstCode = mstCode;
	}

	public int getDetCode() {
		return detCode;
	}

	public void setDetCode(int detCode) {
		this.detCode = detCode;
	}

	public int getCodeSeq() {
		return codeSeq;
	}

	public void setCodeSeq(int codeSeq) {
		this.codeSeq = codeSeq;
	}

	public int getCodeUse() {
		return codeUse;
	}

	public void setCodeUse(int codeUse) {
		this.codeUse = codeUse;
	}

	public String getMstName() {
		return mstName;
	}

	public void setMstName(String mstName) {
		this.mstName = mstName;
	}

	public String getDetName() {
		return detName;
	}

	public void setDetName(String detName) {
		this.detName = detName;
	}

	@Override
	public String toString() {
		return "ComCodeVO [mstCode=" + mstCode + ", detCode=" + detCode + ", codeSeq=" + codeSeq + ", codeUse="
				+ codeUse + ", mstName=" + mstName + ", detName=" + detName + ", toString()=" + super.toString() + "]";
	}
	
	
}

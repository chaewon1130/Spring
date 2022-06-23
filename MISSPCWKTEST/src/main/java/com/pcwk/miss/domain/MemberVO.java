/**
* <pre>
* com.pcwk.miss.domain
* Class Name : UserVO.java
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
public class MemberVO extends DTO {
	private int mbNum; //회원번호
	private String mbId; //회원아이디
	private String mbName; //이름
	private String mbTel; //전화번호
	private String mbBirth; //생년월일
	private String mbNickname; //닉네임
	private int mbGrade; //회원등급
	private int mbPoint; //포인트
	
	public MemberVO() {
		
	}

	public MemberVO(int mbNum, String mbId, String mbName, String mbTel, String mbBirth, String mbNickname, int mbGrade,
			int mbPoint) {
		super();
		this.mbNum = mbNum;
		this.mbId = mbId;
		this.mbName = mbName;
		this.mbTel = mbTel;
		this.mbBirth = mbBirth;
		this.mbNickname = mbNickname;
		this.mbGrade = mbGrade;
		this.mbPoint = mbPoint;
	}

	public int getMbNum() {
		return mbNum;
	}

	public void setMbNum(int mbNum) {
		this.mbNum = mbNum;
	}

	public String getMbId() {
		return mbId;
	}

	public void setMbId(String mbId) {
		this.mbId = mbId;
	}

	public String getMbName() {
		return mbName;
	}

	public void setMbName(String mbName) {
		this.mbName = mbName;
	}

	public String getMbTel() {
		return mbTel;
	}

	public void setMbTel(String mbTel) {
		this.mbTel = mbTel;
	}

	public String getMbBirth() {
		return mbBirth;
	}

	public void setMbBirth(String mbBirth) {
		this.mbBirth = mbBirth;
	}

	public String getMbNickname() {
		return mbNickname;
	}

	public void setMbNickname(String mbNickname) {
		this.mbNickname = mbNickname;
	}

	public int getMbGrade() {
		return mbGrade;
	}

	public void setMbGrade(int mbGrade) {
		this.mbGrade = mbGrade;
	}

	public int getMbPoint() {
		return mbPoint;
	}

	public void setMbPoint(int mbPoint) {
		this.mbPoint = mbPoint;
	}

	@Override
	public String toString() {
		return "MemberVO [mbNum=" + mbNum + ", mbId=" + mbId + ", mbName=" + mbName + ", mbTel=" + mbTel + ", mbBirth="
				+ mbBirth + ", mbNickname=" + mbNickname + ", mbGrade=" + mbGrade + ", mbPoint=" + mbPoint
				+ ", toString()=" + super.toString() + "]";
	}
	
}

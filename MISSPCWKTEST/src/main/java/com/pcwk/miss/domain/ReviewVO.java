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
public class ReviewVO extends DTO {
	private int rNum; //리뷰순번
	private int rRating; //별점
	private String rReview; //한줄평
	private int mbNum; //작성자 회원번호
	private int mvNum; //영화번호
	
	public ReviewVO() {
		
	}

	public ReviewVO(int rNum, int rRating, String rReview, int mbNum, int mvNum) {
		super();
		this.rNum = rNum;
		this.rRating = rRating;
		this.rReview = rReview;
		this.mbNum = mbNum;
		this.mvNum = mvNum;
	}

	public int getrNum() {
		return rNum;
	}

	public void setrNum(int rNum) {
		this.rNum = rNum;
	}

	public int getrRating() {
		return rRating;
	}

	public void setrRating(int rRating) {
		this.rRating = rRating;
	}

	public String getrReview() {
		return rReview;
	}

	public void setrReview(String rReview) {
		this.rReview = rReview;
	}

	public int getMbNum() {
		return mbNum;
	}

	public void setMbNum(int mbNum) {
		this.mbNum = mbNum;
	}

	public int getMvNum() {
		return mvNum;
	}

	public void setMvNum(int mvNum) {
		this.mvNum = mvNum;
	}

	@Override
	public String toString() {
		return "ReviewVO [rNum=" + rNum + ", rRating=" + rRating + ", rReview=" + rReview + ", mbNum=" + mbNum
				+ ", mvNum=" + mvNum + ", toString()=" + super.toString() + "]";
	}
	
}

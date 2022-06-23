/**
* <pre>
* com.pcwk.miss.domain
* Class Name : MovieVO.java
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
public class MovieVO extends DTO {
	private int mvNum; //영화번호
	private String mvTitle; //제목
	private String mvDirector; //감독
	private String mvActor; //배우
	private String mvGenre; //장르
	private String mvReleased; //개봉일
	private int mvAgelimit; //연령제한(전체이용가 1, 12, 15, 18, 19, 미정 99)
	private String mvSummary; //줄거리
	private int mvNation; //국가(국내영화1, 해외영화2)
	private int mvTime; //러닝타임
	
	public MovieVO() {}

	public MovieVO(int mvNum, String mvTitle, String mvDirector, String mvActor, String mvGenre, String mvReleased,
			int mvAgelimit, String mvSummary, int mvNation, int mvTime) {
		super();
		this.mvNum = mvNum;
		this.mvTitle = mvTitle;
		this.mvDirector = mvDirector;
		this.mvActor = mvActor;
		this.mvGenre = mvGenre;
		this.mvReleased = mvReleased;
		this.mvAgelimit = mvAgelimit;
		this.mvSummary = mvSummary;
		this.mvNation = mvNation;
		this.mvTime = mvTime;
	}

	public int getMvNum() {
		return mvNum;
	}

	public void setMvNum(int mvNum) {
		this.mvNum = mvNum;
	}

	public String getMvTitle() {
		return mvTitle;
	}

	public void setMvTitle(String mvTitle) {
		this.mvTitle = mvTitle;
	}

	public String getMvDirector() {
		return mvDirector;
	}

	public void setMvDirector(String mvDirector) {
		this.mvDirector = mvDirector;
	}

	public String getMvActor() {
		return mvActor;
	}

	public void setMvActor(String mvActor) {
		this.mvActor = mvActor;
	}

	public String getMvGenre() {
		return mvGenre;
	}

	public void setMvGenre(String mvGenre) {
		this.mvGenre = mvGenre;
	}

	public String getMvReleased() {
		return mvReleased;
	}

	public void setMvReleased(String mvReleased) {
		this.mvReleased = mvReleased;
	}

	public int getMvAgelimit() {
		return mvAgelimit;
	}

	public void setMvAgelimit(int mvAgelimit) {
		this.mvAgelimit = mvAgelimit;
	}

	public String getMvSummary() {
		return mvSummary;
	}

	public void setMvSummary(String mvSummary) {
		this.mvSummary = mvSummary;
	}

	public int getMvNation() {
		return mvNation;
	}

	public void setMvNation(int mvNation) {
		this.mvNation = mvNation;
	}

	public int getMvTime() {
		return mvTime;
	}

	public void setMvTime(int mvTime) {
		this.mvTime = mvTime;
	}

	@Override
	public String toString() {
		return "MovieVO [mvNum=" + mvNum + ", mvTitle=" + mvTitle + ", mvDirector=" + mvDirector + ", mvActor="
				+ mvActor + ", mvGenre=" + mvGenre + ", mvReleased=" + mvReleased + ", mvAgelimit=" + mvAgelimit
				+ ", mvSummary=" + mvSummary + ", mvNation=" + mvNation + ", mvTime=" + mvTime + ", toString()="
				+ super.toString() + "]";
	}

	
}
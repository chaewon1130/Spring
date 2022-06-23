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
public class MovieInfoVO extends DTO {
	private int mvNum; //영화번호
	private String miTime; //상영시간
	private int miQuality; //화질
	private String miVideo; //동영상경로
	
	public MovieInfoVO() {
		
	}

	public MovieInfoVO(int mvNum, String miTime, int miQuality, String miVideo) {
		super();
		this.mvNum = mvNum;
		this.miTime = miTime;
		this.miQuality = miQuality;
		this.miVideo = miVideo;
	}

	public int getMvNum() {
		return mvNum;
	}

	public void setMvNum(int mvNum) {
		this.mvNum = mvNum;
	}

	public String getMiTime() {
		return miTime;
	}

	public void setMiTime(String miTime) {
		this.miTime = miTime;
	}

	public int getMiQuality() {
		return miQuality;
	}

	public void setMiQuality(int miQuality) {
		this.miQuality = miQuality;
	}

	public String getMiVideo() {
		return miVideo;
	}

	public void setMiVideo(String miVideo) {
		this.miVideo = miVideo;
	}

	@Override
	public String toString() {
		return "MovieInfoVO [mvNum=" + mvNum + ", miTime=" + miTime + ", miQuality=" + miQuality + ", miVideo="
				+ miVideo + ", toString()=" + super.toString() + "]";
	}
	
}

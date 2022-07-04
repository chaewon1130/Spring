/**
* <pre>
* com.pcwk.ehr.chart.domain
* Class Name : PieVO.java
* Description: 파이차트 data Value Object
* Author: ITSC
* Since: 2022/07/04
* Version 0.1
* Copyright (C) by KandJang All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/07/04 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ehr.chart.domain;

import com.pcwk.ehr.cmn.DTO;

/**
 * @author ITSC
 *
 */
public class PieVO extends DTO {
	
	private String topping; //토핑
	private int slices; //개수
	
	public PieVO() {
		
	}

	public PieVO(String topping, int slices) {
		super();
		this.topping = topping;
		this.slices = slices;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	@Override
	public String toString() {
		return "PieVO [topping=" + topping + ", slices=" + slices + ", toString()=" + super.toString() + "]";
	}
	
}

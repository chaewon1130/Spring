/**
* <pre>
* com.pcwk.ehr
* Class Name : JsonArrayMain.java
* Description:
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
package com.pcwk.ehr;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.pcwk.ehr.chart.domain.PieVO;

/**
 * @author ITSC
 *
 */
public class JsonArrayMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<PieVO> list = new ArrayList<PieVO>();
		PieVO pieVO01 = new PieVO("버섯", 3);
		PieVO pieVO02 = new PieVO("양파", 1);
		PieVO pieVO03 = new PieVO("올리브", 1);
		PieVO pieVO04 = new PieVO("호박", 1);
		PieVO pieVO05 = new PieVO("페퍼로니", 1);
		
		list.add(pieVO01);
		list.add(pieVO02);
		list.add(pieVO03);
		list.add(pieVO04);
		list.add(pieVO05);
		
		Gson gson = new Gson();
		JsonArray jArray = new JsonArray();
		for(PieVO vo : list) {
			JsonArray sArray = new JsonArray();
			sArray.add(vo.getTopping());
			sArray.add(vo.getSlices());
			jArray.add(sArray);
		}
		System.out.println(jArray.toString());
	}

}

/**
* <pre>
* com.pcwk.ehr.chart.controller
* Class Name : ChartController.java
* Description: 구글 차트
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
package com.pcwk.ehr.chart.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.pcwk.ehr.chart.domain.LevelChartVO;
import com.pcwk.ehr.chart.domain.PieVO;
import com.pcwk.ehr.user.service.UserService;

/**
 * @author ITSC
 *
 */
@Controller("chartController")
@RequestMapping("chart")
public class ChartController {
	
	final Logger LOG = LogManager.getLogger(this.getClass());
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/levelPerMemberCntView.do", method=RequestMethod.GET)
	public String levelPerMemberCntView() throws SQLException{
		LOG.debug("===================");
		LOG.debug("=levelPerMemberCntView()=");
		LOG.debug("===================");
		
		return "chart/level_per_member_cnt";
	}
	
	@RequestMapping(value = "/drawlevelPerMemberCnt.do", method=RequestMethod.GET,
			produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String drawlevelPerMemberCnt() throws SQLException{
		List<LevelChartVO> list = userService.levelPerMemberCnt();
		JsonArray jArray = new JsonArray();
		for(LevelChartVO vo : list) {
			JsonArray sArray = new JsonArray();
			sArray.add(vo.getLevelName());
			sArray.add(vo.getLevelCount());
			jArray.add(sArray);
		}
		LOG.debug("===============================");
		LOG.debug("=jArray=" + jArray.toString());
		LOG.debug("===============================");
		
		return jArray.toString();
	}
	
	@RequestMapping(value = "/drawPieChart.do", method=RequestMethod.GET,
			produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String drawPieChart() {
		String jsonString = "";
		LOG.debug("===================");
		LOG.debug("=drawPieChart()=");
		LOG.debug("===================");
		
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
		
		return jArray.toString();
	}
	
	@RequestMapping(value = "/lineView.do", method=RequestMethod.GET)
	public String lineView() throws SQLException{
		LOG.debug("===================");
		LOG.debug("=lineView()=");
		LOG.debug("===================");
		
		return "chart/line";
	}
	
	@RequestMapping(value = "/pieView.do", method=RequestMethod.GET)
	public String pieView() throws SQLException{
		LOG.debug("===================");
		LOG.debug("=pieView()=");
		LOG.debug("===================");
		
		return "chart/pie";
	}
}

/**
* <pre>
* com.pcwk.miss.controller
* Class Name : PayController.java
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
package com.pcwk.miss.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



/**
 * @author ITSC
 *
 */
@Controller
@RequestMapping("pay")
public class PayController {
	
	public PayController() {}
	
	final Logger LOG = LogManager.getLogger(getClass());
	
	@RequestMapping(value = "/paying.do")
	public String payView() {
		LOG.debug("==================");
		LOG.debug("=PayController=payView()=");
		LOG.debug("==================");
		return "pay/paypage";
	}
	
	@RequestMapping(value = "/paycom.do")
	public String paycomView() {
		LOG.debug("==================");
		LOG.debug("=PayController=paycomView()=");
		LOG.debug("==================");
		return "pay/paycomplate";
	}
	
	

}

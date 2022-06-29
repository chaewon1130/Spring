/**
* <pre>
* com.pcwk.ehr.file.controller
* Class Name : FileController.java
* Description:
* Author: ITSC
* Since: 2022/06/29
* Version 0.1
* Copyright (C) by KandJang All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/06/29 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ehr.file.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ITSC
 *
 */
@Controller("fileController")
@RequestMapping("file")
public class FileController {
	final Logger LOG = LogManager.getLogger(this.getClass());
	
	public FileController() {
		
	}
	
	// http://localhost:8081/ehr/file/fileUpView.do
	@RequestMapping(value = "/fileUpView.do")
	public String fileUpView() {
		LOG.debug("=========================");
		LOG.debug("=fileUpView()=");
		LOG.debug("=========================");
		return "file/file_upload";
	}
}

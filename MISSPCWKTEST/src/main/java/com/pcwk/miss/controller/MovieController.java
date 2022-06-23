package com.pcwk.miss.controller;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.pcwk.miss.domain.MovieVO;
import com.pcwk.miss.movie.service.MovieService;

@Controller("movieController")
@RequestMapping("movie")
public class MovieController {
	final Logger LOG = LogManager.getLogger(this.getClass());
	
	@Autowired
	MovieService movieService;
	
	public MovieController() {
		
	}
	
	@RequestMapping(value = "/main.do", method=RequestMethod.GET)
	public String mainView(Model model) throws SQLException {
		System.out.println("===================");
		System.out.println("=MissController=mainView()=");
		System.out.println("===================");
		
		MovieVO inVO;
		 movieService.doSelectOne(inVO);
		return "movie/main";
	}
	
	@RequestMapping(value="doSelectOne.do", method = RequestMethod.GET
			, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String doSelectOne(MovieVO inVO) throws SQLException{
		LOG.debug("====================");
		LOG.debug("=inVO=" + inVO);
		LOG.debug("====================");
		
		MovieVO outVO = movieService.doSelectOne(inVO);
		Gson gson = new Gson();
		String jsonString = gson.toJson(outVO);
		LOG.debug("====================");
		LOG.debug("=jsonString=" + jsonString);
		LOG.debug("====================");
		
		return jsonString;
	}
	
	@RequestMapping(value = "/movie_detail.do")
	public String movieDetailView() {
		System.out.println("===================");
		System.out.println("=MissController=movieDetailView()=");
		System.out.println("===================");
		return "movie/movie_detail";
	}
	
	@RequestMapping(value = "/screen.do")
	public String screenView() {
		System.out.println("==================");
		System.out.println("=MissController=screenView()=");
		System.out.println("==================");
		return "movie/screen";
	}
	
	
	
	
}


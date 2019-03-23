package com.watkings.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.watkings.dto.NewsAddDto;
import com.watkings.service.NewsService;
import com.watkings.domain.entity.News;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/news")
public class NewsController {
	
	@Autowired
	NewsService newsService;
	
	Log log = LogFactory.getLog(NewsController.class);

	@RequestMapping(value="/add")
	public void addNews(@RequestBody NewsAddDto newsAddDto){
		log.info(" news/add  --------" + newsAddDto.getTitle() + newsAddDto.getBody() );
		newsService.addNews(newsAddDto);
	}

	@RequestMapping(value="/get/{number}")
	public List<News> getNewsList(@PathVariable int number){
		return newsService.getNewsList(number);
	}
}

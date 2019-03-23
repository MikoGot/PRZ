package com.watkings.service;

import java.util.Date;
import java.util.List;

import com.watkings.dto.NewsAddDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.watkings.domain.entity.News;
import com.watkings.domain.repository.NewsRepository;

@Component
public class NewsService {
	
	@Autowired
	NewsRepository newsRepository;

	public void addNews(NewsAddDto newsAddDto) {
		News news = new News();
		prepareNewsByDto(news, newsAddDto);
		newsRepository.save(news);
	}

	private void prepareNewsByDto(News news, NewsAddDto newsAddDto) {
		if(newsAddDto.getTitle()!=null)
			news.setTitle(newsAddDto.getTitle());
		if(newsAddDto.getBody()!=null)
			news.setBody(newsAddDto.getBody());		
		news.setDate(new Date());
	}

	public List<News> getNewsList(int number) {
		return newsRepository.getNumberOfNewses(number);
		
	}

}

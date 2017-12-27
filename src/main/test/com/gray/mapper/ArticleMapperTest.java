package com.gray.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gray.bean.Article;
import com.gray.mapper.ArticleMapper;

public class ArticleMapperTest {
	private ApplicationContext applicationContext;

	
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		ArticleMapper articleMapper = (ArticleMapper) applicationContext.getBean("articleMapper");
		Article article = articleMapper.findArticleById(1);
		System.out.println(article);
	}
}

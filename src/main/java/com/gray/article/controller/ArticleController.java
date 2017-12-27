package com.gray.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.gray.bean.Article;
import com.gray.mapper.ArticleMapper;
//文章
@Controller
@RequestMapping("/test")
public class ArticleController {
	@Autowired
	ArticleMapper articleMapper;
	@RequestMapping(value="article.do",method=RequestMethod.GET)
	public String article(@RequestParam(value="id",required=false)int id) throws Exception {
		Article article = articleMapper.findArticleById(id);
		article.getClass();
		System.out.println(article);
//		modelAndView.addObject(attributeName, attributeValue)
//		modelAndView.setViewName("");
		return "success";
	}
}

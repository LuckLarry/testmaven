package com.gray.mapper;

import com.gray.bean.Article;

public interface ArticleMapper {
	public Article findArticleById(int id) throws Exception;
}

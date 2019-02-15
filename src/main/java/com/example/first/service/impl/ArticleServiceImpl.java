package com.example.first.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.first.mapper.IArticleMapper;
import com.example.first.pojo.Article;
import com.example.first.service.IArticleService;

/**
 * 文章业务实现层
 * @author Thunisoft
 *
 */
@Service
public class ArticleServiceImpl implements IArticleService {
	@Autowired
	private IArticleMapper articleMapper;
	
	//添加随记
	@Override
	public int addDiary(String title, int classify, String content) 
	{
		Article article=new Article();
		article.setTitle(title);
		article.setClassify(classify);
//		article.setAuthor(author);//添加作者信息
		article.setContent(content);
		article.setWriteTime(new Date());
		return articleMapper.addDiary(article);
	}
	
	//添加文章
	@Override
	public int addArticle(String title,int classify,String content) 
	{
		Article article=new Article();
		article.setTitle(title);
		article.setClassify(classify);
//		article.setAuthor(author);//添加作者信息
		article.setContent(content);
		article.setWriteTime(new Date());
		return articleMapper.addArticle(article);
	}

}

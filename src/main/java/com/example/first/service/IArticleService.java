package com.example.first.service;

/**
 * 
 * 文章业务层
 * @author Thunisoft
 *
 */
public interface IArticleService {
	//添加随记
	public int addDiary(String title, int classify, String content);
	//添加给文章
	public int addArticle(String title,int classify,String content);

}

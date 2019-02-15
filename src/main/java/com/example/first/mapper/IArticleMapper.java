package com.example.first.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Insert;

import com.example.first.pojo.Article;

/**
 * 随记的文章接口
 * @author Thunisoft
 *
 */
public interface IArticleMapper {
	//添加随记
	@Insert(value="insert into article(title,classify,content,writeTime) value(#{title ,jdbcType=VARCHAR},#{classify,jdbcType=VARCHAR},#{content,jdbcType=VARCHAR},#{writeTime,jdbcType=TIMESTAMP})")
	public int addDiary(Article article);
	
	//添加文章
	@Insert(value="insert into article(title,classify,content,writeTime) value(#{title ,jdbcType=VARCHAR},#{classify,jdbcType=VARCHAR},#{content,jdbcType=VARCHAR},#{writeTime,jdbcType=TIMESTAMP})")
	public int addArticle(Article article );

}

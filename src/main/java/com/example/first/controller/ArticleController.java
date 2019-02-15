package com.example.first.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.first.service.IArticleService;

/**
 * 文章的controller
 * 
 * @author Thunisoft
 *
 */
@Controller
public class ArticleController {
	@Autowired
	private IArticleService articleServiceImpl;
	int result=-1;

	// 添加diary 随记
	@RequestMapping(value = "/addDiary")
	@ResponseBody
	public String insertDiary(String title, String content) {
		int classify = 1;// 代表 随记
		result=articleServiceImpl.addDiary(title, classify, content);
		if(result>0) 
		{
			return "success";
		}else {
			return "fail";
		}
	}

	// 添加文章
	@RequestMapping(value = "/addArticle")
	@ResponseBody
	public String insertArticle(String title, String content) {
		int classify = 2;// 2 代表 技术贴
		result=articleServiceImpl.addArticle(title, classify, content);
		if(result>0) 
		{
			return "success";
		}else {
			return "fail";
		}
	}

}

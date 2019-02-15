package com.example.first.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章实体
 * 
 * @author Thunisoft
 *
 */
public class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7821888483627755873L;

	private int articleId;// 文章的id
	private String title;// 文章标题
	private int classify;// 文章分类
	private String content;// 内容
	private String author;// 作者
	private String comment;// 评论
	private int like;// 喜欢
	private int notLike;// 不喜欢
	private String picture;// 插图
	private Date writeTime;// 插入时间
	private Date updateTime;// 更新时间

	public Article() {
		super();
	}

	public Article(String title, int classify, String content, String author, String comment, int like, int notLike,
			String picture, Date writeTime, Date updateTime) {
		super();
		this.title = title;
		this.classify = classify;
		this.content = content;
		this.author = author;
		this.comment = comment;
		this.like = like;
		this.notLike = notLike;
		this.picture = picture;
		this.writeTime = writeTime;
		this.updateTime = updateTime;
	}

	public Article(int articleId, String title, int classify, String content, String author, String comment,
			int like, int notLike, String picture, Date writeTime, Date updateTime) {
		super();
		this.articleId = articleId;
		this.title = title;
		this.classify = classify;
		this.content = content;
		this.author = author;
		this.comment = comment;
		this.like = like;
		this.notLike = notLike;
		this.picture = picture;
		this.writeTime = writeTime;
		this.updateTime = updateTime;
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getClassify() {
		return classify;
	}

	public void setClassify(int classify) {
		this.classify = classify;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getNotLike() {
		return notLike;
	}

	public void setNotLike(int notLike) {
		this.notLike = notLike;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Date getWriteTime() {
		return writeTime;
	}

	public void setWriteTime(Date writeTime) {
		this.writeTime = writeTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title + ", classify=" + classify + ", content="
				+ content + ", author=" + author + ", comment=" + comment + ", like=" + like + ", notLike=" + notLike
				+ ", picture=" + picture + ", writeTime=" + writeTime + ", updateTime=" + updateTime + "]";
	}

}

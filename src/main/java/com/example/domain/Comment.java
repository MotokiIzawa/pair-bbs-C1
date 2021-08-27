package com.example.domain;

/**
 * コメントを表すエンティティ.
 * 
 * @author izawamotoki
 */
public class Comment {

	/** id */
	public Integer id;

	/** 名前 */
	public String name;

	/** コメント */
	public String content;

	/** 関連づく記事ID */
	public Integer articleId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", name=" + name + ", content=" + content + ", articleId=" + articleId + "]";
	}

}

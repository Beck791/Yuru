package com.yurucamp.forum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity @Component @Table(name="Forum")
public class ForumBean {
	
//	論壇
	
	private	Integer forumId;
	private	String forumName;
	private	String forumImage;
	
	
	

	@Id @Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getForumId() {
		return forumId;
	}
	public void setForumId(Integer forumId) {
		this.forumId = forumId;
	}
	
	@Column(name="name")
	public String getForumName() {
		return forumName;
	}
	public void setForumName(String forumName) {
		this.forumName = forumName;
	}
	
	@Column(name="image")
	public String getForumImage() {
		return forumImage;
	}
	public void setForumImage(String forumImage) {
		this.forumImage = forumImage;
	}
	
	
	
	


	
}

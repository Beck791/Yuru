package com.yurucamp.forum.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity @Component @Table(name="Reply")
public class ReplyBean {

//	回覆文章
	
	private	Integer reId;
	private String memberId;
	private	Date reCreatTime;
	private	Date reUpDateTime;
	private	String reContent;
	private	String reImage;
	
	
	
	@Id @Column(name="reId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	public Integer getReId() {
		return reId;
	}
	public void setReId(Integer reId) {
		this.reId = reId;
	}
	
	
	@Column(name="memberId")
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	
	@Column(name="reCreatTime")
	public Date getReCreatTime() {
		return reCreatTime;
	}
	public void setReCreatTime(Date reCreatTime) {
		this.reCreatTime = reCreatTime;
	}
	
	
	@Column(name="reUpDateTime")
	public Date getReUpDateTime() {
		return reUpDateTime;
	}
	public void setReUpDateTime(Date reUpDateTime) {
		this.reUpDateTime = reUpDateTime;
	}
	
	
	@Column(name="reContent")
	public String getReContent() {
		return reContent;
	}
	public void setReContent(String reContent) {
		this.reContent = reContent;
	}
	
	
	@Column(name="reImage")
	public String getReImage() {
		return reImage;
	}
	public void setReImage(String reImage) {
		this.reImage = reImage;
	}
	
	
	
	
	
	
	
	
}

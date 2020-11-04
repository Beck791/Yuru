package com.yurucamp.forum.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity @Component @Table(name="Post")
public class PostBean {
	
//	發文文章	
	
	private Integer poId;
	private String memberId;
	private String poTitle;
	private Date poCreatTime;
	private Date poUpDateTime;
	private String poContent;
	private String poImage;

	private	Integer likeNumber;
	private	Integer reContentNumber;
	private	Integer clickNumber;
	
	
	
	@Id @Column(name="poId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getPoId() {
		return poId;
	}
	public void setPoId(Integer poId) {
		this.poId = poId;
	}
	
	@Column(name="memberId")
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	@Column(name="poTitle")
	public String getPoTitle() {
		return poTitle;
	}
	public void setPoTitle(String poTitle) {
		this.poTitle = poTitle;
	}
	
	
	@Column(name="poCreatTime")
	public Date getPoCreatTime() {
		return poCreatTime;
	}
	public void setPoCreatTime(Date poCreatTime) {
		this.poCreatTime = poCreatTime;
	}
	
	
	@Column(name="poUpDateTime")
	public Date getPoUpDateTime() {
		return poUpDateTime;
	}
	public void setPoUpDateTime(Date poUpDateTime) {
		this.poUpDateTime = poUpDateTime;
	}
	
	
	@Column(name="poContent")
	public String getPoContent() {
		return poContent;
	}
	public void setPoContent(String poContent) {
		this.poContent = poContent;
	}
	
	
	@Column(name="poImage")
	public String getPoImage() {
		return poImage;
	}
	public void setPoImage(String poImage) {
		this.poImage = poImage;
	}
	
	
	@Column(name="likeNumber")
	public Integer getLikeNumber() {
		return likeNumber;
	}
	public void setLikeNumber(Integer likeNumber) {
		this.likeNumber = likeNumber;
	}
	
	
	@Column(name="reContentNumber")
	public Integer getReContentNumber() {
		return reContentNumber;
	}
	public void setReContentNumber(Integer reContentNumber) {
		this.reContentNumber = reContentNumber;
	}
	
	
	@Column(name="clickNumber")
	public Integer getClickNumber() {
		return clickNumber;
	}
	public void setClickNumber(Integer clickNumber) {
		this.clickNumber = clickNumber;
	}
	
	
	
	
}

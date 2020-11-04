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
	
	private	Integer id;
	private	String name;
	private	String image;
	
	
	
	
	@Id @Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="image")
	public String getimage() {
		return image;
	}
	public void setimage(String image) {
		this.image = image;
	}
	
	
	
	


	
}

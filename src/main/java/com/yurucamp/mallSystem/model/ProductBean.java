package com.yurucamp.mallSystem.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="Product")
public class ProductBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id ;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "brandId")
	private String brandId;
	
	@Column(name = "price")
	private Integer price;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "webTraffic")
	private Integer webTraffic;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "statusId")
	private Integer statusId;
	
	@Column(name = "stock")
	private Integer stock;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "createtime")
	private Date createtime;
	
	@Column(name = "updatetime")
	private Date updatetime;
	
	
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
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getWebTraffic() {
		return webTraffic;
	}
	public void setWebTraffic(Integer webTraffic) {
		this.webTraffic = webTraffic;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
	

}
	
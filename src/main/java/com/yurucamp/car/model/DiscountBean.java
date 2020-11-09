package com.yurucamp.car.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Discount")
public class DiscountBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	private Integer couponName;
	private Integer discountAmount;
	private Float threeDay;
	private Float fiveDay;

	public DiscountBean() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCouponName() {
		return couponName;
	}

	public void setCouponName(Integer couponName) {
		this.couponName = couponName;
	}

	public Integer getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Integer discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Float getThreeDay() {
		return threeDay;
	}

	public void setThreeDay(Float threeDay) {
		this.threeDay = threeDay;
	}

	public Float getFiveDay() {
		return fiveDay;
	}

	public void setFiveDay(Float fiveDay) {
		this.fiveDay = fiveDay;
	}
	
	

}

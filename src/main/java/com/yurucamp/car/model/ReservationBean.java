package com.yurucamp.car.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.yurucamp.member.model.MemberBean;

@Entity
@Table(name = "Reservation")
public class ReservationBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Transient
	private Integer memberId;
	private Date orderDate;
	private Integer dept;
	private Integer ret;
	private Date deptDate;
	private Integer deptTime;
	private Date returnDate;
	private Integer returnTime;
	private Integer type;
	private Integer device;
	@Transient
	private Integer couponId;
	private Integer amount;
	private Integer count;
	public Integer getId() {
		return id;
	}
	
	@ManyToOne(cascade=CascadeType.ALL)    // javax.persistence.CascadeType;
	@JoinColumn(name="FK_MemberBean_Id")  
	private MemberBean MemberBean;
	
	public ReservationBean(Integer id,Integer memberId,Date orderDate,Integer dept,Integer ret,Date deptDate,Integer deptTime,Date returnDate,
			Integer returnTime,Integer type,Integer device,Integer couponId,Integer amount,Integer count) {
		this.id = id;
		this.memberId = memberId;
		this.orderDate = orderDate;
		this.dept = dept;
		this.ret = ret;
		this.deptDate = deptDate;
		this.deptTime = deptTime;
		this.returnDate = returnDate;
		this.returnTime = returnTime;
		this.type = type;
		this.device = device;
		this.couponId = couponId;
		this.amount = amount;
		this.count = count;
	}

	public ReservationBean() {
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Integer getDept() {
		return dept;
	}
	public void setDept(Integer dept) {
		this.dept = dept;
	}
	public Integer getRet() {
		return ret;
	}
	public void setRet(Integer ret) {
		this.ret = ret;
	}
	public Date getDeptDate() {
		return deptDate;
	}
	public void setDeptDate(Date deptDate) {
		this.deptDate = deptDate;
	}
	public Integer getDeptTime() {
		return deptTime;
	}
	public void setDeptTime(Integer deptTime) {
		this.deptTime = deptTime;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Integer getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(Integer returnTime) {
		this.returnTime = returnTime;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getDevice() {
		return device;
	}
	public void setDevice(Integer device) {
		this.device = device;
	}
	public Integer getCouponId() {
		return couponId;
	}
	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}

	public void setMemberBean(MemberBean MemberBean) {
		this.MemberBean = MemberBean;
		
	}
	
	

}

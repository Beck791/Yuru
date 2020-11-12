package com.yurucamp.camp.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "campInfo")
@Component
public class CampInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "altitude")
	private Integer altitude;

	@Column(name = "owner")
	private String owner;

	@Column(name = "ownerPhone")
	private String ownerPhone;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "campInfo", cascade = CascadeType.ALL)
	private CampDetail campDetail;
	
	@Transient
	private CampDetail campDetail1;

	public CampInfo() {
	}

	public CampInfo(Integer id, String name, String address, Integer altitude, String owner, String ownerPhone) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.altitude = altitude;
		this.owner = owner;
		this.ownerPhone = ownerPhone;
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAltitude() {
		return altitude;
	}

	public void setAltitude(Integer altitude) {
		this.altitude = altitude;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwnerPhone() {
		return ownerPhone;
	}

	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}

	public CampDetail getCampDetail() {
		return campDetail;
	}

	public void setCampDetail(CampDetail campDetail) {
		this.campDetail = campDetail;
	}

}

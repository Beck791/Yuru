package com.yurucamp.camp.model;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CampDetail")
public class CampDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "campInfoId")
	private Integer campInfoId;

	@Column(name = "closed")
	private String closed;

	@Column(name = "image")
	private Blob image;

	@Column(name = "power")
	private String power;

	@Column(name = "signal")
	private String signal;

	@Column(name = "equipment")
	private String equipment;

	@Column(name = "parking")
	private String parking;

	@Column(name = "types")
	private String types;
	
	@Column(name = "waterHeater")
	private String waterHeater;

	@Column(name = "hashTag")
	private String hashTag;
	
	public CampDetail() {
	}

	public CampDetail(Integer id, Integer campInfoId, String closed, Blob image, String power, String signal,
			String equipment, String parking, String types, String waterHeater, String hashTag) {
		super();
		this.id = id;
		this.campInfoId = campInfoId;
		this.closed = closed;
		this.image = image;
		this.power = power;
		this.signal = signal;
		this.equipment = equipment;
		this.parking = parking;
		this.types = types;
		this.waterHeater = waterHeater;
		this.hashTag = hashTag;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCampInfoId() {
		return campInfoId;
	}

	public void setCampInfoId(Integer campInfoId) {
		this.campInfoId = campInfoId;
	}

	public String getClosed() {
		return closed;
	}

	public void setClosed(String closed) {
		this.closed = closed;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getSignal() {
		return signal;
	}

	public void setSignal(String signal) {
		this.signal = signal;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getWaterHeater() {
		return waterHeater;
	}

	public void setWaterHeater(String waterHeater) {
		this.waterHeater = waterHeater;
	}

	public String getHashTag() {
		return hashTag;
	}

	public void setHashTag(String hashTag) {
		this.hashTag = hashTag;
	}

	
}

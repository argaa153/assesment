package com.java.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "car")
public class Car {

	@Id
	private int id;
	private String name;
	@Transient
	private String brd;

	@ManyToOne
	@JoinColumn(name = "brand_id", nullable = false)
	private Brand brand;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Brand getBrand() {
//		return brand;
//	}

	public void setBrand(Brand brand) {
		this.brand = brand;

	}

	public String getBrd() {
		return brand.getName();
	}

}

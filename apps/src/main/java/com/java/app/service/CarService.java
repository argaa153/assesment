package com.java.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.app.entity.Car;
import com.java.app.repository.BrandRepository;
import com.java.app.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	CarRepository car;
	
	@Autowired
	BrandRepository brand;
	
	public List<Car> getCar(){
		return car.findAll();
	}
	
	public List<Car> getCarByBrand(String name){
		return car.findAllByBrandName(name);
	}
}

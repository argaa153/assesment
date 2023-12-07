package com.java.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.app.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
	public List<Car> findAllByBrandName(String name);
}

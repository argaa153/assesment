package com.java.app.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.app.entity.Car;
import com.java.app.service.CarService;

@RestController
public class Controller {
	@Autowired
	CarService service;

	@RequestMapping("/")
	public String home() {
		return "Training Java";
	}

	@RequestMapping(value = "/car")
	public List<Car> car() {
		return service.getCar();
	}

	@RequestMapping(value = "/car", params = "brand")
	public List<?> carBrand(@RequestParam(name = "brand") String brand) {
		return service.getCarByBrand(brand);

	}

	@RequestMapping(value = "/car", params = "prefix")
	public List<Car> carStream(@RequestParam(name = "prefix") String prefix) {
		List<Car> res = service.getCar();
		return res.stream().filter(s -> s.getName().startsWith(prefix)).collect(Collectors.toList());
	}

}

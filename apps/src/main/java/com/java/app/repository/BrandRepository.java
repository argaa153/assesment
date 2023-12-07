package com.java.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.app.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

}

package com.tnsif.adminservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.adminservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

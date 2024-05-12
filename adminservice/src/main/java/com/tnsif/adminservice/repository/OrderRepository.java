package com.tnsif.adminservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.adminservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

package com.tnsf.admin.entity;

import java.time.LocalDate;

import jakarta.persistence.Table;

@Table (name="tblborder")
public class Order {
	private Long id;
	private LocalDate date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Order() {
		super();
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

}

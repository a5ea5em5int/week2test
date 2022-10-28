package com.software.week2.entity;

import java.time.LocalDateTime;

public class Employee {
	
	private int id;
	private String name;
	private String degree;
	private LocalDateTime dob;
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
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public LocalDateTime getDatetime() {
		return dob;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.dob = datetime;
	}
	public Employee(int id, String name, String degree, LocalDateTime dob) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", degree=" + degree + ", dob=" + dob + "]";
	}
	

}

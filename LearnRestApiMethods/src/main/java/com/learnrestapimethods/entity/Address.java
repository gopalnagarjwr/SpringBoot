package com.learnrestapimethods.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
      
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String city;
	private int pinCode;
    private int houseNo;
    
    @OneToOne(mappedBy = "add")
    @JsonBackReference
    private Employee emp;

	public Address() {
		super();	 
	}
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", pinCode=" + pinCode + ", houseNo=" + houseNo + ", emp=" + emp
				+ "]";
	}
	 
	
    
    
	
	
}

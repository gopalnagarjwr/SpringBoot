package com.learnrestapimethods.entity;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Workers")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String name;
	private long contect;
	private String branch;

	@OneToOne(cascade = CascadeType.ALL)
	@JsonIdentityReference
	private Address add;

	public Employee(int id, String name, long contect, String branch, Address add) {
		super();
		Id = id;
		this.name = name;
		this.contect = contect;
		this.branch = branch;
		this.add = add;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Employee() {
		super();

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContect() {
		return contect;
	}

	public void setContect(long contect) {
		this.contect = contect;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", contect=" + contect + ", branch=" + branch + ", add=" + add
				+ "]";
	}

}

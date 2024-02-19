package com.learnrestapimethods.entity;

public class Employee {

	private int Id;
	private String name;
	private long contect;
	private String branch;

	public Employee(int id, String name, long contect, String branch) {
		super();
		Id = id;
		this.name = name;
		this.contect = contect;
		this.branch = branch;
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
		return "Employee [Id=" + Id + ", name=" + name + ", contect=" + contect + ", branch=" + branch + "]";
	}

}

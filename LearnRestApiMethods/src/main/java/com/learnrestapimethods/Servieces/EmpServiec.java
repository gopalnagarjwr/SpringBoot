package com.learnrestapimethods.Servieces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.learnrestapimethods.entity.Employee;

@Component
public class EmpServiec {
	private static List<Employee> ll = new ArrayList();

	static {
		ll.add(new Employee(1, "vikas", 25896317, "Bsc"));
		ll.add(new Employee(2, "Vaibhav", 1452786, "CS"));
		ll.add(new Employee(3, "Jobhy", 14852735, "B-Tech"));
		ll.add(new Employee(4, "rahul", 12456325, "BA"));
	}

	// get all the data from list
	public List<Employee> getAllEmp() {
		return ll;
	}

	// get date by id from list
	public Employee getEmp(int Id) {
		Employee employee = ll.stream().filter(u -> u.getId() == Id).findFirst().get();
		return employee;
	}

	// add data to the list
	public Employee add(Employee emp) {
		ll.add(emp);
		return emp;
	}

	// update excting data from list
	public Employee Update(Employee emp) {
		ll = ll.stream().map(e -> {
			if (e.getId() == emp.getId()) {
				e.setName(emp.getName());
				e.setContect(emp.getContect());
				e.setBranch(emp.getBranch());
				return e;
			} else {
				return e;
			}
		}).collect(Collectors.toList());

		return emp;
	}

	// delete data from list by id
	public void delete(int id) {
		ll = ll.stream().filter(e -> e.getId() != id).collect(Collectors.toList());
	}

}

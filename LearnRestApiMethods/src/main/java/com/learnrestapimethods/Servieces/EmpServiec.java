package com.learnrestapimethods.Servieces;

 
import java.util.List;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learnrestapimethods.entity.Employee;
import com.learnrestapimethods.productdao.UserRepository;

@Component
public class EmpServiec {
	
	@Autowired
	private UserRepository rep;

	// get all the data from list
	public List<Employee> getAllEmp() {
		return (List<Employee>) rep.findAll();
	}

	// get date by id from list
	public Employee getEmp(int Id) {
		Employee employee = null;
		try {
			employee = rep.findById(Id);
		} catch (Exception e) {

		}
		return employee;
	}

	// add data to the list
	public Employee add(Employee emp) {
		Employee save = null;
		try {
			save = rep.save(emp);
		} catch (Exception e) {
			return null;
		}
		return save;
	}

	// update excting data from list
	public Employee Update(Employee emp) {
		Employee save = null;
		try {
			save = rep.save(emp);
		} catch (Exception e) {
			return null;
		}
		return save;
	}

	// delete data from list by id
	public void delete(int id) {
		rep.deleteById(id);
	}

}

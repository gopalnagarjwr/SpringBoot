package com.learnrestapimethods.controllar;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.learnrestapimethods.Servieces.EmpServiec;
import com.learnrestapimethods.entity.Employee;

@RestController
public class HomeControllar {

	@Autowired
	private EmpServiec emps;

	@GetMapping("/Emp")
	public List<Employee> getAllEmp() {
		return this.emps.getAllEmp();
	}

	@GetMapping("/Emp/{id}")
	public Employee getEmpById(@PathVariable("id") int id) {
		return this.emps.getEmp(id);
	}

	@PostMapping("/Emp")
	public Employee addEmp(@RequestBody Employee emp) {
		return this.emps.add(emp);
	}

	@PutMapping("/Emp")
	public Employee UpdateEmp(@RequestBody Employee emp) {
		return this.emps.Update(emp);
	}

	@DeleteMapping("/Emp/{EmpId}")
	public void DeleteEmp(@PathVariable("EmpId") int id) {
		this.emps.delete(id);
	}

}

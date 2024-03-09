package com.learnrestapimethods.controllar;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Employee>> getAllEmp() {
		if (this.emps.getAllEmp().size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(this.emps.getAllEmp());
	}

	@GetMapping("/Emp/{id}")
	public ResponseEntity<Employee> getEmpById(@PathVariable("id") int id) {
		Employee emp = this.emps.getEmp(id);
		if (emp == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(emp));
	}
	

	@PostMapping("/Emp")
	public ResponseEntity<Employee> addEmp(@RequestBody Employee emp) {
		try {
			Employee add = this.emps.add(emp);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PutMapping("/Emp")
	public ResponseEntity<Employee> UpdateEmp(@RequestBody Employee emp) {

		try {
			Employee update = this.emps.Update(emp);
			return ResponseEntity.of(Optional.of(update));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DeleteMapping("/Emp/{EmpId}")
	public ResponseEntity<Void> DeleteEmp(@PathVariable("EmpId") int id) {
		try {
			this.emps.delete(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

}

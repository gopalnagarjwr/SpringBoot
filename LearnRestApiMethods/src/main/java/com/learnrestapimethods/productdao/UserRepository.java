package com.learnrestapimethods.productdao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learnrestapimethods.entity.Employee;

@Repository
public interface UserRepository extends CrudRepository<Employee, Integer> {
         public Employee findById(int id);
}

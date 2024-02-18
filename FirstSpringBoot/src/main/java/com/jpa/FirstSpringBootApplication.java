package com.jpa;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.repository.CrudRepository;

import com.jpa.entity.User;
import com.jpa.prodouctdao.UserRespository;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		var run = SpringApplication.run(FirstSpringBootApplication.class, args);
		UserRespository bean = run.getBean(UserRespository.class);
		
//		Add user in Database  ->

		User u = new User();
		u.setName("vikas");
		u.setCity("jaipur");
		u.setStatus("He is a developer... ");
		User user = bean.save(u);
		System.out.println(user);

//		get User by id ->

		Optional<User> u1 = bean.findById(1);
		System.out.println(u);

//		get All User By id ->

		Iterable<User> all = bean.findAll();
		all.forEach(us -> {
			System.out.println(us);
		});
		System.out.println(all);

//		update User ->

		Optional<User> optional = bean.findById(52);
		User fined = optional.get();
		fined.setName("rahul");
		fined.setCity("kota");
		User save = bean.save(fined);
		System.out.println(save);

//		Delete User from database

		bean.deleteById(2);
		System.out.println("User Deleted...");

	}

}

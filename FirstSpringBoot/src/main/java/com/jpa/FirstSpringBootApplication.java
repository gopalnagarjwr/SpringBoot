package com.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;

import com.jpa.entity.User;
import com.jpa.prodouctdao.UserRespository;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		var run = SpringApplication.run(FirstSpringBootApplication.class, args);
		UserRespository bean = run.getBean(UserRespository.class);

		List<User> findByName = bean.findByName("vikas");
		findByName.forEach(u -> {
			System.out.println(u);
		});

		List<User> findByNameAndCity = bean.findByNameAndCity("rahul", "kota");
		findByNameAndCity.forEach(u -> {
			System.out.println(u);
		});

		List<User> findByNameStartingWith = bean.findByNameStartingWith("vik");
		findByNameStartingWith.forEach(u -> {
			System.out.println(u);
		});
	}

}

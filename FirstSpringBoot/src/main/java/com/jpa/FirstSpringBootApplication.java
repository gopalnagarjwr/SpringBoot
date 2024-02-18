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
                 List<User> allUser = bean.getAllUser();
                 allUser.forEach(u->{System.out.println(u);});
                 
                 System.out.println("_____________________________________");
                 
                 List<User> whereUser = bean.getWhereUser("vikas");
                 whereUser.forEach(u->{System.out.println(u);});
                 
                 System.out.println("_____________________________________");
                 
                 List<User> allUser1 = bean.getAllUserByNative();
                 allUser1.forEach(u->{System.out.println(u);});
	 
	}

}

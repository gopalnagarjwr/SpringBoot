package com.jpa.prodouctdao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.entity.User;

public interface UserRespository extends CrudRepository<User, Integer> {
 
	   @Query("select u from User u")
	   public List<User> getAllUser();
	
	   @Query("select u from User u WHERE u.name =:n")
	   public List<User> getWhereUser(@Param("n") String name);
	   
	   @Query(value="select * from User",nativeQuery=true)
	   public List<User> getAllUserByNative();
}

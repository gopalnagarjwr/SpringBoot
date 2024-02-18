package com.jpa.prodouctdao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.entity.User;

public interface UserRespository extends CrudRepository<User, Integer> {
	public List<User> findByName(String name);

	public List<User> findByNameAndCity(String name, String city);

	public List<User> findByNameStartingWith(String prefix);
}

package com.jpa.prodouctdao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.entity.User;

public interface UserRespository extends CrudRepository<User, Integer> {

}

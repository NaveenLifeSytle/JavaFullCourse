package com.naveen.dao;

import org.springframework.data.repository.CrudRepository;

import com.naveen.model.User;

public interface UserDAO extends CrudRepository<User,Integer>{

}

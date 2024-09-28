package com.myapp.Respositiry_dao;

import org.springframework.data.repository.CrudRepository;

import com.myapp.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}

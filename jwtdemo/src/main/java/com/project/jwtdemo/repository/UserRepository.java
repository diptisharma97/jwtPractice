package com.project.jwtdemo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.jwtdemo.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	Optional<User> findByUsername(String username);
	Boolean existsByUsername(String userName);
	Boolean existsByEmail(String email);

}

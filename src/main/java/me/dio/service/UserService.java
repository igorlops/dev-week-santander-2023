package me.dio.service;

import org.springframework.stereotype.Service;

import me.dio.domain.model.User;

@Service
public interface UserService {

	User findById(Long id);
	
	User create(User userToCreate);
}

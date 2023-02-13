package com.batch2.onlineshopping.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.batch2.onlineshopping.entity.User;
import com.batch2.onlineshopping.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUserDetails(User user) {

		if (user.getPassword().equals(user.getConfirmPassword())) {
			String encryptedPassword = new BCryptPasswordEncoder().encode(user.getPassword());
			user.setPassword(encryptedPassword);
			return userRepository.save(user);
		}
		return null;

	}

	@Override
	public User updateUser(User user, int id) {

		if (user.getPassword().equals(user.getConfirmPassword())) {
			
			user.setId(id);
			User user1 = userRepository.save(user);
			return user1;
		}
		return null;

	}
	@Override
	public Optional<User> getUserDetails(int id) {

		return userRepository.findById(id);
	}

	@Override
	public void deleteUser(int id) {

		userRepository.deleteById(id);
	}
	@Override
	public String login(User user) {
		User user1 = userRepository.findByUsername(user.getUsername());
		if(user1.getPassword().equals(user.getPassword())) {
			return "Successfuly logged in";
		}
		return "Enter valid username and password.";
	}
	
}

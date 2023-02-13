package com.batch2.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.batch2.onlineshopping.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	//@Query(value = "SELECT id, username, email_id, password, phone_no, roles FROM user WHERE username=?1", nativeQuery = true)
	

	//@Query(value = "SELECT id, username, email_id, password, phone_no, roles FROM user WHERE id=?1", nativeQuery = true)
	public User getUserById(int id);

	public User findByUsername(String username);

}

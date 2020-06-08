package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.models.Users;

@Repository
public interface UsersDAO extends JpaRepository<Users, Integer>{
	
	public List<Users> findUserByUsername(String username);
	
	@SuppressWarnings("unchecked")
	public Users save(Users user);
	
	
	public Users findUsersByEmail(String email);
	
}

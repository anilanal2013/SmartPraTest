package com.sgl.smartpra.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sgl.smartpra.app.model.Users;

@Repository
public class UserServiceDAO {
	@Autowired
	UserRepository userRepository;
	
	public List<Users> getUsersList(){
		return userRepository.findAll();
	}

}

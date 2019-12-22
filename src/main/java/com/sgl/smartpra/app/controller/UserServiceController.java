package com.sgl.smartpra.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sgl.smartpra.app.dao.UserServiceDAO;
import com.sgl.smartpra.app.model.Users;

@RestController
public class UserServiceController {

	@Autowired
	UserServiceDAO userServiceDAO;
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	 public List<Users> getUsersList() {
	return userServiceDAO.getUsersList();
	 }
}

package com.user.user_full_stack_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.user_full_stack_project.dao.UserDao;
import com.user.user_full_stack_project.dto.User;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return dao.saveUser(user);
	}


	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return dao.getAllUser();
	}


	public User deleteUser(int id) {
		// TODO Auto-generated method stub
		return dao.deleteUser(id);
	}


	public User updateUser(User user ,int id) {
		// TODO Auto-generated method stub
		return dao.updateUser(user,id);
	}


	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return dao.getUserById(id);
	}
	
	

}

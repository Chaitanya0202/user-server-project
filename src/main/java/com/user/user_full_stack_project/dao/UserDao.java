package com.user.user_full_stack_project.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.user.user_full_stack_project.dto.User;
import com.user.user_full_stack_project.repo.UserRepo;

@Repository
public class UserDao {
	@Autowired
	private UserRepo repo;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public User deleteUser(int id) {
		// TODO Auto-generated method stub
		Optional<User>optional=repo.findById(id);
		if(optional!=null) {
			User user=optional.get();
			repo.delete(user);
			return user;
		}
		return null;
				
	}

	public User updateUser(User user,int id) {
		Optional<User>optional=repo.findById(id);
		if(optional!=null) {
			user.setId(id);
//			User dbuser=optional.get();
			return repo.save(user);
		}
		return null;
		
	}

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		Optional<User>optional=repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

}

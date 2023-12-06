package com.user.user_full_stack_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.user_full_stack_project.dto.User;
import com.user.user_full_stack_project.service.UserService;

@RestController
@CrossOrigin("http://localhost:3000/")
//@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@GetMapping("/getAllUser")
	public List<User> getAllUser() {
		return service.getAllUser();
	}

	@DeleteMapping("/deleteUserById/{id}")
	public User deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
	
	@PutMapping("/updateUser/{id}")
	public User updateUser(@RequestBody User user , @PathVariable int id) {
		return service.updateUser(user,id);
	}
	
	@GetMapping("/getById/{id}")
	public User getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}

}

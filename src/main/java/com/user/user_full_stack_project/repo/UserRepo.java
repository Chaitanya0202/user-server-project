package com.user.user_full_stack_project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.user_full_stack_project.dto.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	

}

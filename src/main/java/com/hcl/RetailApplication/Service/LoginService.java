package com.hcl.RetailApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.RetailApplication.Entity.User;
import com.hcl.RetailApplication.Repository.UserRepository;

@Service

public class LoginService {
	@Autowired 
	UserRepository userRepository;
	public User login(String userName,String password) {
		
	
	User user=userRepository.findByUserNameAndPassword(userName,password);
			return user;
	}
}

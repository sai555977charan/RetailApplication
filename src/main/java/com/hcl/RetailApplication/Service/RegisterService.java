package com.hcl.RetailApplication.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hcl.RetailApplication.Entity.User;
import com.hcl.RetailApplication.Repository.UserRepository;

@Service
public class RegisterService {
	@Autowired
	UserRepository userRepository;
	
public User addUser(User user)
{
	return  userRepository.save(user);
}
}

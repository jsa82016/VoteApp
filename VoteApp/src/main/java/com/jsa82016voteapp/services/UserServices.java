package com.jsa82016voteapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jsa82016voteapp.models.Authority;
import com.jsa82016voteapp.models.User;
import com.jsa82016voteapp.repositories.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public void save(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		Authority authority = new Authority();
		authority.setAuthority("ROLE_USER");
		authority.setUser(user);
		user.getAuthorities().add(authority);
		userRepository.save(user);
	}
}

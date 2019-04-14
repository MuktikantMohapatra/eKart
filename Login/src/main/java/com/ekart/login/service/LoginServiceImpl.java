package com.ekart.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ekart.login.entities.LoginDetails;
import com.ekart.login.entities.EkartUser;
import com.ekart.login.repository.LoginRepository;
import com.ekart.login.repository.UserRepository;

@Service
public class LoginServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private LoginRepository loginRepository;

	public EkartUser registerUser(EkartUser user) {
        System.out.println("LoginServiceImpl.registerUser()::::::::::before");
        System.out.println(user);
		userRepository.save(user);	
		System.out.println("LoginServiceImpl.registerUser()::::::::::::After");
		return user;
	}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		LoginDetails loginDetails = loginRepository.findByEmail(email);
		if (loginDetails == null) {
			throw new UsernameNotFoundException("Invalid Username/email or Password");
		}
		return new User(email, loginDetails.getPassword(), loginDetails.getRole());
	}

}

package com.saurabh.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.saurabh.springboot.model.User;
import com.saurabh.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}


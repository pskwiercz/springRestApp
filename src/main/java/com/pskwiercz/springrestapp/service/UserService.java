package com.pskwiercz.springrestapp.service;

import com.pskwiercz.springrestapp.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    UserDto createUser(UserDto userDto);
}

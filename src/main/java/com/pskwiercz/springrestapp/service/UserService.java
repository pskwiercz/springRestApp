package com.pskwiercz.springrestapp.service;

import com.pskwiercz.springrestapp.dto.UserDto;

public interface UserService {

    UserDto createUser(UserDto userDto);
}

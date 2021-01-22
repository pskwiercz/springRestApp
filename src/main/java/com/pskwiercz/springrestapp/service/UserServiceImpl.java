package com.pskwiercz.springrestapp.service;

import com.pskwiercz.springrestapp.dto.UserDto;
import com.pskwiercz.springrestapp.entity.UserEntity;
import com.pskwiercz.springrestapp.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {

        if (userRepository.findByEmail(userDto.getEmail()) != null) throw new RuntimeException("User exists!");

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto, userEntity);

        userEntity.setEncryptedPassword("test");
        userEntity.setUserId("testUserId");
        UserEntity storedUser = userRepository.save(userEntity);

        UserDto createdUser = new UserDto();
        BeanUtils.copyProperties(storedUser, createdUser);
        return createdUser;
    }

}

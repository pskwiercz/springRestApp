package com.pskwiercz.springrestapp.repository;

import com.pskwiercz.springrestapp.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    //Auto-impl for fields
    UserEntity findByEmail(String email);
}

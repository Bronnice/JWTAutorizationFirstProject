package com.study.jwtappdemo.repository;

import com.study.jwtappdemo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
    User findByUsername(String name);
}

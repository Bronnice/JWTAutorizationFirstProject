package com.study.jwtappdemo.repository;

import com.study.jwtappdemo.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepo extends CrudRepository<Role, Long> {
    Role findByName(String name);
}

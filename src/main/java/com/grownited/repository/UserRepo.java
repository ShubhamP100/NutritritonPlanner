package com.grownited.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grownited.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer>{
    
}

package com.example.postgresqldemo.postgresqldemo.dao;

import com.example.postgresqldemo.postgresqldemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

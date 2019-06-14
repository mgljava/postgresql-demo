package com.example.postgresqldemo.postgresqldemo.service;

import com.example.postgresqldemo.postgresqldemo.dao.UserRepository;
import com.example.postgresqldemo.postgresqldemo.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

  private final UserRepository userRepository;

  public void saveUser(User user) {
    userRepository.save(user);
  }
}

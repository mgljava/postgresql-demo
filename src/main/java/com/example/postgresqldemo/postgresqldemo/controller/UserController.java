package com.example.postgresqldemo.postgresqldemo.controller;

import com.example.postgresqldemo.postgresqldemo.entity.User;
import com.example.postgresqldemo.postgresqldemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping
  public String saveUser(User user) {
    userService.saveUser(user);
    return "SUCCESS";
  }
}

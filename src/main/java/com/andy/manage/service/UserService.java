package com.andy.manage.service;

import com.andy.manage.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
  User save(User user);

  User findById(String id);

  void delete(User user);

  List<User> findAll();
}

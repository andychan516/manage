package com.andy.manage.service.impl;

import com.andy.manage.dao.UserDao;
import com.andy.manage.entity.User;
import com.andy.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  UserDao userDao;

  @Override
  public User save(User user) {
    return userDao.save(user);
  }

  @Override
  public User findById(String id) {
    return userDao.findById(id);
  }

  public void delete(User user) {
    userDao.delete(user);
  }

  @Override
  public List<User> findAll() {
    return userDao.findAll();
  }

}

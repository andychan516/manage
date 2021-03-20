package com.andy.manage.dao;

import com.andy.manage.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDao extends PagingAndSortingRepository<User, Long>, JpaSpecificationExecutor<User>, JpaRepository<User,Long> {
  User findById(String id);
}

package com.demo.service;

import com.demo.entity.User;

import java.util.List;

public interface UserService {

    List<User> listAll();

    User getById(Long id);

    int create(User user);

    int modify(User user);

    int removeById(Long id);
}

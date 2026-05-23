package com.demo.service.impl;

import com.demo.entity.User;
import com.demo.mapper.UserMapper;
import com.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> listAll() {
        return userMapper.findAll();
    }

    @Override
    public User getById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public int create(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int modify(User user) {
        return userMapper.update(user);
    }

    @Override
    public int removeById(Long id) {
        return userMapper.deleteById(id);
    }
}

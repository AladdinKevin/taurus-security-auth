package com.taurus.security.demo.service.impl;

import com.taurus.security.demo.dao.UserMapper;
import com.taurus.security.demo.entity.model.User;
import com.taurus.security.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}

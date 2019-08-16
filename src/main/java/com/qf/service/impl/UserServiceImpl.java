package com.qf.service.impl;

import com.qf.dao.UserMapper;
import com.qf.pojo.UserInfo;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
   UserMapper userMapper;

    public UserInfo checkName(UserInfo user) {
        return userMapper.checkName(user);
    }
}
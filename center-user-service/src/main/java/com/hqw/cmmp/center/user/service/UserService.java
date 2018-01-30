package com.hqw.cmmp.center.user.service;

import com.hqw.cmmp.center.user.dao.UserMapper;
import com.hqw.cmmp.center.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User getUser(Long id) {
        return userMapper.getUser(id);
    }
}

package com.yorozuya.mcp_tools.service.impl;

import com.yorozuya.mcp_tools.domain.User;
import com.yorozuya.mcp_tools.repository.UserMapper;
import com.yorozuya.mcp_tools.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.findAll();
    }
}

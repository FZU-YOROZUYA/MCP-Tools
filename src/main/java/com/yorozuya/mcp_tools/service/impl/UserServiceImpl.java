package com.yorozuya.mcp_tools.service.impl;

import com.yorozuya.mcp_tools.domain.User;
import com.yorozuya.mcp_tools.repository.UserMapper;
import com.yorozuya.mcp_tools.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("UserMapper")
    private UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public List<User> getUsers() {
        return userMapper.findAll();
    }
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }//注册时需要
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public int updateUserById(User user) {
        return userMapper.updateUserById(user);
    }//改变用户信息
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public int updateUserByUsername(User user) {
        return userMapper.updateUserByUsername(user);
    }//改变用户信息
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public int deleteUserById(int id) {
        return userMapper.deleteUserById(id);
    }
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public int deleteUserByUsername(String username) {
        return userMapper.deleteUserByUsername(username);
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public boolean loginJudge(User user) {
        User testUser=userMapper.findByUsername(user.getUsername());
        if(testUser!=null&&testUser.getPassword().equals(user.getPassword())){
            return true;
        }
        return false;
    }
}

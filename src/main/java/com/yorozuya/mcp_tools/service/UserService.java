package com.yorozuya.mcp_tools.service;

import com.yorozuya.mcp_tools.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User findById(int id);
    User findByUsername(String username);
    int insertUser(User user);
    int updateUserById(User user);
    int updateUserByUsername(User user);
    int deleteUserById(int id);
    int deleteUserByUsername(String username);
    boolean loginJudge(User user);
}

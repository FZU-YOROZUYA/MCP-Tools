package com.yorozuya.mcp_tools.repository;

import com.yorozuya.mcp_tools.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("UserMapper")
public interface UserMapper {
    List<User> findAll();
    User findById(@Param("uid") int id);
    User findByUsername(@Param("username") String username);
    int insertUser(User user);
    int updateUserById(User user);
    int updateUserByUsername(User user);
    int deleteUserById(@Param("uid") int id);
    int deleteUserByUsername(@Param("username") String username);
}

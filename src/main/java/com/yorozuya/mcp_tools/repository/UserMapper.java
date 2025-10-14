package com.yorozuya.mcp_tools.repository;

import com.yorozuya.mcp_tools.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> findAll();
}

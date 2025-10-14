package com.yorozuya.mcp_tools.repository;

import com.yorozuya.mcp_tools.McpToolsApplication;
import com.yorozuya.mcp_tools.domain.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = McpToolsApplication.class)
public class TestUserMapper {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testFindAll(){
        List<User> users = userMapper.findAll();
    }
}

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
        User _user=new User();
        _user.setId(1);
        _user.setUsername("王浩楠");
        _user.setPassword("123456");
        userMapper.insertUser(_user);
        User _user0=new User();
        _user0.setId(2);
        _user0.setUsername("MikeTuring");
        _user0.setPassword("pzl945464");
        userMapper.insertUser(_user0);
        User _user1=new User();
        _user1.setId(4);
        _user1.setUsername("时科");
        _user1.setPassword("shike.1989115");
        userMapper.insertUser(_user1);
        List<User> users = userMapper.findAll();
        System.out.println("==========================================================");
        for (User user3:users){
            System.out.println(user3.toString());
        }
        //这里的2和“时科并不对应同一行，只是为了测试”
        System.out.println("==========================================================");
        System.out.println(userMapper.findById(2));
        User user=new User();
        user.setUsername("时科");
        user.setPassword("123456");
        userMapper.updateUserByUsername(user);
        System.out.println("==========================================================");
        System.out.println(userMapper.findByUsername(user.getUsername()).toString());
        userMapper.deleteUserById(4);
        users = userMapper.findAll();
        System.out.println("==========================================================");
        for (User user3:users){
            System.out.println(user3.toString());
        }
        userMapper.deleteUserByUsername("MikeTuring");
        User user0=new User();
        user0.setId(1);
        user0.setPassword("pzl945464");
        userMapper.updateUserById(user0);
        users = userMapper.findAll();
        System.out.println("==========================================================");
        for (User user3:users){
            System.out.println(user3.toString());
        }
        userMapper.deleteUserById(1);
        users = userMapper.findAll();
        System.out.println("==========================================================");
        for (User user3:users){
            System.out.println(user3.toString());
        }
        System.out.println("==========================================================");
    }
}

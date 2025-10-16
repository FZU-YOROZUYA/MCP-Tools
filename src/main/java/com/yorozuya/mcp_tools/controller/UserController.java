package com.yorozuya.mcp_tools.controller;

import com.yorozuya.mcp_tools.domain.User;
import com.yorozuya.mcp_tools.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/find_all")
    public List<User> findAll() {
        return userService.getUsers();
    }
}

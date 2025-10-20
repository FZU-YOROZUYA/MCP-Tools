package com.yorozuya.mcp_tools.controller;

import com.yorozuya.mcp_tools.domain.User;
import com.yorozuya.mcp_tools.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    @Qualifier("UserService")
    private UserService userService;

    @GetMapping("/find_all")
    public List<User> findAll() {
        return userService.getUsers();
    }

    @GetMapping("/find_by_id")
    public User findById(@RequestParam("id") int id) {
        return userService.findById(id);
    }

    @GetMapping("/find_by_username")
    public User findByUsername(@RequestParam("username")String username) {
        return userService.findByUsername(username);
    }

    @PostMapping("/insert")
    public int insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }

    @PostMapping("/update_by_id")
    public int updateById(@RequestBody User user) {
        return userService.updateUserById(user);
    }

    @PostMapping("/update_by_username")
    public int updateByUsername(@RequestBody User user) {
        return userService.updateUserByUsername(user);
    }

    @PostMapping("/delete_by_id")
    public int deleteById(@RequestParam("id") int id) {
        return userService.deleteUserById(id);
    }

    @PostMapping("/delete_by_username")
    public int deleteByUsername(@RequestParam("username") String username) {
        return userService.deleteUserByUsername(username);
    }

    @PostMapping("/login")
    public boolean loginJudge(@RequestBody User user) {
        return userService.loginJudge(user);
    }

}

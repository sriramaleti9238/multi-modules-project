package com.multimoduleproject.pproject.controller;

import com.multimoduleproject.pproject.entity.User;
import com.multimoduleproject.pproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        System.out.println(user.toString());
        return userService.createUser(user);
    }
}
package com.multimoduleproject.pproject.service;

import com.multimoduleproject.pproject.entity.User;
import com.multimoduleproject.pproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        System.out.println(user.toString());
        return userRepository.save(user);
    }
}
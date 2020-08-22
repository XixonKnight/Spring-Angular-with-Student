package com.example.springboot.service;

import com.example.springboot.repository.UserRepo;
import com.example.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getAllUsers() {
        return this.userRepo.findAll();
    }

    public User addUser(User user) {
        return this.userRepo.save(user);
    }

    public void deleteUserById(Integer id) {
        this.userRepo.deleteById(id);
    }
}

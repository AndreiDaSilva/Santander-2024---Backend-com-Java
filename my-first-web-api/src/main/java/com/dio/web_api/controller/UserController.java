package com.dio.web_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.web_api.model.User;
import com.dio.web_api.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers(){   
       return userRepository.findAll();
    }

    @GetMapping("/name/{username}")
    public User getOneUser(@PathVariable("username") String username){
        return userRepository.findByUserName(username);
    }

    @GetMapping("/id/{userId}")
    public User getOneUserId(@PathVariable("userId") Integer userId){
        return userRepository.findById(userId);
    }

    @DeleteMapping()
    public void deleteUserId(@RequestBody Integer userId){
        userRepository.deleteById(userId);
    }

    @PostMapping()
    public void postUser(@RequestBody User user){
        userRepository.save(user);
    }




}

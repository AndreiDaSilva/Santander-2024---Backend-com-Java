package com.dio.dio_spring_security_jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.dio_spring_security_jwt.model.User;
import com.dio.dio_spring_security_jwt.services.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping
    public void postUser(@RequestBody User user){
        service.creteUser(user);
    }
}

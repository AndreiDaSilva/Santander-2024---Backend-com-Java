package com.dio.dio_spring_security_jwt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dio.dio_spring_security_jwt.model.User;
import com.dio.dio_spring_security_jwt.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder encoder;
    public void creteUser(User user){
        String pass = user.getPassword();
        user.setPassword(encoder.encode(pass));
        userRepository.save(user);
    }
}

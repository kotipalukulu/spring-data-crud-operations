package com.koti.palukulu.demo.service.impl;

import com.koti.palukulu.demo.dto.User;
import com.koti.palukulu.demo.repository.UserRepository;
import com.koti.palukulu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(int id){
        return userRepository.findById(id);

    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User create(User user){
        return userRepository.save(user);
    }
}

package com.koti.palukulu.demo.service;

import com.koti.palukulu.demo.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> getUser(int id);
    List<User> getAllUsers();
    User create(User user);
}

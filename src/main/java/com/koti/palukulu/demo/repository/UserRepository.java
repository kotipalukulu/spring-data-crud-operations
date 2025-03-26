package com.koti.palukulu.demo.repository;

import com.koti.palukulu.demo.dto.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findById(int id);
    List<User> findAll();
    User save(User user);
}

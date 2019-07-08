package com.edureka.userms.service;

import com.edureka.userms.model.User;
import com.edureka.userms.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getALUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getSingleUser(Long id) {
        return userRepository.findById(id).get();
    }
}

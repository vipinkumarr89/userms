package com.edureka.userms.service;

import com.edureka.userms.model.User;

import java.util.List;

public interface UserService {

    public List<User> getALUsers();
    public User getSingleUser(Long id);
}

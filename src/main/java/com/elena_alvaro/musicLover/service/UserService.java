package com.elena_alvaro.musicLover.service;

import com.elena_alvaro.musicLover.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}

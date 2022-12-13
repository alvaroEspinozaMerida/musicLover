package com.elena_alvaro.musicLover.service;

import com.elena_alvaro.musicLover.model.User;
import com.elena_alvaro.musicLover.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getById(long userID) {
        return userRepository.findById( userID).get();

    }

    @Override
    public void addFriend(long userID, User user) {
        userRepository.findById(userID).get().addFriend(user);
    }

    @Override
    public List<User> getFriends(long userID) {
        return  userRepository.findById( userID).get().getFriends();
    }


    @Override
    public List<String> getFavoriteArtist(long userID) {
        return userRepository.findById( userID).get().getFavoriteArtist();
    }
    @Override
    public List<String> getFavoriteSongs(long userID) {
        return userRepository.findById(userID).get().getFavoriteSongs();
    }
}

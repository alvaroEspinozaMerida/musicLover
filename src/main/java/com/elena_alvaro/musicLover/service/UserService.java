package com.elena_alvaro.musicLover.service;

import com.elena_alvaro.musicLover.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();



    public User getById(long id);

    public void addFriend(long userID, User user);


    public List <User> getFriends(long userID);

    public List <String> getFavoriteArtist(long userID);

    public List <String> getFavoriteSongs(long userID);



}

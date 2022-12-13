package com.elena_alvaro.musicLover.controller;

import com.elena_alvaro.musicLover.model.User;
import com.elena_alvaro.musicLover.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New User added";
    }
    @PostMapping("/addFriend/{userID}/{friendID}")
    public String addToFriendsList(@PathVariable Long userID, @PathVariable Long friendID){
        userService.addFriend(userID,getUser(friendID));
        return "New Friend added to user "+userID+ " friend list";
    }









    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }


    @RequestMapping(value = "/getUser/{userID}")
    public User getUser(@PathVariable Long userID){
        return userService.getById(userID);
    }

    @GetMapping("/getFriends/{userID}")
    public List<User> getFriends(@PathVariable Long userID)
    { return  userService.getFriends(userID);}

}

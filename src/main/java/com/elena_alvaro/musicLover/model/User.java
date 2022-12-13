package com.elena_alvaro.musicLover.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
public class User{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String bio;
    private String profilePic;
    private String location;
    private String spotify;
    @OneToMany
    private List <User> friends;

    @ElementCollection
    private List<String> favoriteArtist;
    @ElementCollection
    private List<String>  favoriteSongs;


    public List<String> getFavoriteArtist() {
        return favoriteArtist;
    }

    public void setFavoriteArtist(List<String> favoriteArtist) {
        this.favoriteArtist = favoriteArtist;
    }

    public List<String> getFavoriteSongs() {
        return favoriteSongs;
    }

    public void setFavoriteSongs(List<String> favoriteSongs) {
        this.favoriteSongs = favoriteSongs;
    }

    public User(long userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }

    public User() {

    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User newFriend){
        if (!friends.contains(newFriend)) {
            friends.add(newFriend);
        }
    }



    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    // not using getters and setters for the user id because the database will generate it

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpotify() {
        return spotify;
    }

    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", bio=" + bio + ", profilePic=" + profilePic + ", location=" + location +", spotify=" + spotify + '}';
    }



}

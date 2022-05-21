package com.example.instagram;

public class User {
    public String userName;
    public int userImage;

    public User(String userName, int userImage) {
        this.userName = userName;
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserImage() {
        return userImage;
    }
}

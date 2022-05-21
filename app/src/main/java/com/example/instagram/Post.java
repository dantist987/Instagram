package com.example.instagram;

public class Post {
    public int postAvatar;
    public String postLogin;
    public String postLocation;
    public int postMore;
    public int post;

    public Post(int postAvatar, String postLogin, String postLocation, int postMore, int post) {
        this.postAvatar = postAvatar;
        this.postLogin = postLogin;
        this.postLocation = postLocation;
        this.postMore = postMore;
        this.post = post;
    }

    public int getpostAvatar() {
        return postAvatar;
    }

    public String getpostLogin() {
        return postLogin;
    }

    public String getpostLocation() {
        return postLocation;
    }

    public int getpostMore() {
        return postMore;
    }

    public int getPost() {
        return post;
    }
}

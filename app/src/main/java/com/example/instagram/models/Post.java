package com.example.instagram.models;

public class Post {
    public int postAvatar;
    public String postLogin;
    public String postLocation;
    public int postMore;
    public int post, like, comment, resend, save, description, more;

    public Post(int postAvatar, String postLogin, String postLocation, int postMore, int post, int like, int comment, int resend, int save, int description, int more) {
        this.postAvatar = postAvatar;
        this.postLogin = postLogin;
        this.postLocation = postLocation;
        this.postMore = postMore;
        this.post = post;
        this.like = like;
        this.comment = comment;
        this.resend = resend;
        this.save = save;
        this.description = description;
        this.more = more;
    }

    public int getPostAvatar() {
        return postAvatar;
    }

    public String getPostLogin() {
        return postLogin;
    }

    public String getPostLocation() {
        return postLocation;
    }

    public int getPostMore() {
        return postMore;
    }

    public int getPost() {
        return post;
    }

    public int getLike() {
        return like;
    }

    public int getComment() {
        return comment;
    }

    public int getResend() {
        return resend;
    }

    public int getSave() {
        return save;
    }

    public int getDescription() {
        return description;
    }

    public int getMore() {
        return more;
    }
}

package com.example.datajdbc.bean;

import java.util.List;

public class User {
    private Integer userId;
    private String userName;
    private String userSex;

    private List<Task>receivedTasks;

    private List<Task>releasedTasks;

    public List<Task> getReceivedTasks() {
        return receivedTasks;
    }

    public void setReceivedTasks(List<Task> receivedTasks) {
        this.receivedTasks = receivedTasks;
    }

    public List<Task> getReleasedTasks() {
        return releasedTasks;
    }

    public void setReleasedTasks(List<Task> releasedTasks) {
        this.releasedTasks = releasedTasks;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}

package com.example.demo.pojo;

public class UserTable {
    private Integer userId;

    private String userName;

    private String userPhone;

    private String userPassword;

    private String userProfilepicture;

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
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserProfilepicture() {
        return userProfilepicture;
    }

    public void setUserProfilepicture(String userProfilepicture) {
        this.userProfilepicture = userProfilepicture == null ? null : userProfilepicture.trim();
    }
}
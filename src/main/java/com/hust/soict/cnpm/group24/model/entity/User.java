package com.hust.soict.cnpm.group24.model.entity;

import java.util.Objects;

public class User {
    private String userName;
    private String password;
    private String chuTaiKhoan;

    public User() {
    }

    public User(String userName, String password, String chuTaiKhoan) {
        this.userName = userName;
        this.password = password;
        this.chuTaiKhoan = chuTaiKhoan;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChuTaiKhoan() {
        return chuTaiKhoan;
    }

    public void setChuTaiKhoan(String chuTaiKhoan) {
        this.chuTaiKhoan = chuTaiKhoan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }
}

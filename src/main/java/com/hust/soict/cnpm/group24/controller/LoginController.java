/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hust.soict.cnpm.group24.controller;

import com.hust.soict.cnpm.group24.model.entity.User;
import com.hust.soict.cnpm.group24.model.dao.LoginDAO;

/**
 *
 * @author DELL
 */
public class LoginController {

    public static boolean dangNhap(String userName,String password) {
        return LoginDAO.login(userName,password);
    }

    public static boolean themTaiKhoan(User user){
        return LoginDAO.addUser(user) > 0;
    }

    public static boolean xoaTaiKhoan(String userName){
        if(LoginDAO.getListUser().size() < 2) return false;
        return LoginDAO.deleteUser(userName) > 0;
    }
}

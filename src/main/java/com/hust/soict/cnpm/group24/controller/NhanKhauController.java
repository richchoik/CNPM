/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hust.soict.cnpm.group24.controller;

import com.hust.soict.cnpm.group24.model.dao.NhanKhauDAO;
import com.hust.soict.cnpm.group24.model.entity.NhanKhau;


public class NhanKhauController {
   // public static void themNhanKhau(String maNhanKhau,....)
    public static boolean themNhanKhau(NhanKhau nhanKhau){
        if(NhanKhauDAO.addNhanKhau(nhanKhau) > 0)
            return true;
        return false;
    }
    
    public static boolean suaNhanKhau(NhanKhau nhanKhau){
        if(NhanKhauDAO.mdfNhanKhau(nhanKhau) > 0)
            return true;
        else return false;
    }
}

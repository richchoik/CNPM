package com.hust.soict.cnpm.group24.controller;



import com.hust.soict.cnpm.group24.model.dao.HoKhauDAO;
import com.hust.soict.cnpm.group24.model.entity.HoKhau;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HoKhauController {

    public static boolean themHoKhau(HoKhau hoKhau) {
        if(HoKhauDAO.addHoKhau(hoKhau)>0) return true;
        return false;
    }

    public static void suaHoKhau(String maHo, String tenChuHo, int soThanhVien, float dienTich, int soXeMay, int soOTo) {
    }   
}


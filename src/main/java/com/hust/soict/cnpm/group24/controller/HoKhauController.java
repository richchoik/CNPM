package com.hust.soict.cnpm.group24.controller;

import com.hust.soict.cnpm.group24.model.dao.HoKhauDAO;
import com.hust.soict.cnpm.group24.model.entity.HoKhau;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HoKhauController {

    public static boolean themHoKhau(HoKhau hoKhau) {
        return HoKhauDAO.addHoKhau(hoKhau) > 0;
    }

    public static boolean suaHoKhau(HoKhau hoKhau) {
        return HoKhauDAO.mdfHoKhau(hoKhau) > 0;
    }

    public static boolean xoaHoKhau(String maHo){
        return HoKhauDAO.delHoKhau(maHo) > 0;
    }
}

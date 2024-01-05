/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hust.soict.cnpm.group24.controller;

import com.hust.soict.cnpm.group24.model.dao.KhoanPhiDAO;
import com.hust.soict.cnpm.group24.model.entity.KhoanPhi;

/**
 *
 * @author DELL
 */
public class KhoanPhiController {

    public static boolean themKhoanPhi(KhoanPhi khoanPhi) {
        return KhoanPhiDAO.addKhoanPhi(khoanPhi) > 0;
    }

    public static boolean suaKhoanPhi(KhoanPhi khoanPhi) {
        return KhoanPhiDAO.mdfKhoanPhi(khoanPhi) > 0;
    }

    public static boolean xoaKhoanPhi(String maPhi){
        return KhoanPhiDAO.delKhoanPhi(maPhi) > 0;
    }
}

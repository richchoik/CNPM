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
        if (KhoanPhiDAO.addKhoanPhi(khoanPhi) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean suaKhoanPhi(KhoanPhi khoanPhi) {
        if (KhoanPhiDAO.mdfKhoanPhi(khoanPhi) > 0) {
            return true;
        } else {
            return false;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hust.soict.cnpm.group24;

import com.hust.soict.cnpm.group24.model.dao.*;
import com.hust.soict.cnpm.group24.model.entity.HoKhau;
import com.hust.soict.cnpm.group24.model.entity.KhoanPhi;
import com.hust.soict.cnpm.group24.model.entity.NhanKhau;
import com.hust.soict.cnpm.group24.model.entity.NopPhi;

import java.sql.Date;

/**
 *
 * @author LENOVO
 */
public class CNPMGroup24 {
    public static void main(String[] args) {
        System.out.println(KhoanPhiDAO.mdfKhoanPhi(new KhoanPhi("P001","Phí dịch vụ","Bắt buộc",15000)));
    }
}

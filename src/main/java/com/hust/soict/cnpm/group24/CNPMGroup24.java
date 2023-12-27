package com.hust.soict.cnpm.group24;

import com.hust.soict.cnpm.group24.connection.ConnectionUtils;
import com.hust.soict.cnpm.group24.model.dao.*;
import com.hust.soict.cnpm.group24.model.entity.HoKhau;
import com.hust.soict.cnpm.group24.model.entity.KhoanPhi;
import com.hust.soict.cnpm.group24.model.entity.NhanKhau;
import com.hust.soict.cnpm.group24.model.entity.NopPhi;
import com.hust.soict.cnpm.group24.view.ThemHoKhau;
import com.hust.soict.cnpm.group24.view.ThemKhoanThu;
import com.hust.soict.cnpm.group24.view.ThemNhanKhau;
import com.hust.soict.cnpm.group24.view.UpdateHoKhau;

import java.sql.Connection;

import java.sql.Date;

public class CNPMGroup24 {

    public static void main(String[] args) {
//        ThemHoKhau.showThemHoKhau();
//        ThemKhoanThu.showThemKhoanThu();
        ThemNhanKhau.showThemNhanKhau();
    }
}

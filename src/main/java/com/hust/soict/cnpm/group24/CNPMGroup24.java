/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hust.soict.cnpm.group24;

import com.hust.soict.cnpm.group24.connection.ConnectionUtils;
import com.hust.soict.cnpm.group24.model.GiaoVien;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class CNPMGroup24 {

    public static List getListOfGV() {
        List<GiaoVien> list = new ArrayList<>();
        try {
            Connection connection = ConnectionUtils.getConnection();
            Statement statement = connection.createStatement();
            String query = "Select * from GiaoVien";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                String id = resultSet.getString(1);
                String name = resultSet.getString(2);
                String luong = resultSet.getString(3);
                String phai = resultSet.getString(4);
                String ngaySinh = resultSet.getString(5);
                String diaChi = resultSet.getString(6);
                String GVQL = resultSet.getString(7);
                String boMon = resultSet.getString(7);
                list.add(new GiaoVien(id,name,luong,phai,ngaySinh,diaChi,GVQL,boMon));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;

    }
}

package com.hust.soict.cnpm.group24.model.dao;

import com.hust.soict.cnpm.group24.connection.ConnectionUtils;
import com.hust.soict.cnpm.group24.model.entity.KhoanPhi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThongKeDAO {
    public static List<String> getColumns() {
        Connection connection = ConnectionUtils.getConnection();
        List<String> list = new ArrayList<>();
        String sql = "SELECT TenPhi FROM KhoanPhi ORDER BY LoaiPhi";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                list.add(resultSet.getString(1));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return list;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }


}

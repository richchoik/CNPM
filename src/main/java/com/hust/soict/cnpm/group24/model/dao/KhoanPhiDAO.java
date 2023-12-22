package com.hust.soict.cnpm.group24.model.dao;

import com.hust.soict.cnpm.group24.connection.ConnectionUtils;
import com.hust.soict.cnpm.group24.model.entity.HoKhau;
import com.hust.soict.cnpm.group24.model.entity.KhoanPhi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KhoanPhiDAO {
    public static int MA_PHI = 0;
    public static int TEN_PHI = 1;

    public static List<KhoanPhi> getListKhoanPhi() {
        Connection connection = ConnectionUtils.getConnection();
        List<KhoanPhi> list = new ArrayList<>();
        String sql = "SELECT * FROM KhoanPhi";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                KhoanPhi khoanPhi = new KhoanPhi();
                khoanPhi.setMaPhi(resultSet.getString(1));
                khoanPhi.setTenPhi(resultSet.getString(2));
                khoanPhi.setLoaiPhi(resultSet.getString(3));
                khoanPhi.setDonGia(resultSet.getDouble(4));
                list.add(khoanPhi);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return list;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static int addKhoanPhi(KhoanPhi khoanPhi) {
        Connection connection = ConnectionUtils.getConnection();
        String sql = "INSERT INTO KhoanPhi VALUES (?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, khoanPhi.getMaPhi());
            preparedStatement.setString(2, khoanPhi.getTenPhi());
            preparedStatement.setString(3, khoanPhi.getLoaiPhi());
            preparedStatement.setDouble(4, khoanPhi.getDonGia());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static int delKhoanPhi(String maPhi) {
        Connection connection = ConnectionUtils.getConnection();
        String sql = "DELETE FROM KhoanPhi WHERE MaPhi=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maPhi);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static int mdfKhoanPhi(KhoanPhi khoanPhi) {
        Connection connection = ConnectionUtils.getConnection();
        String sql = "UPDATE KhoanPhi SET TenPhi=?,LoaiPhi=?,DonGia=? WHERE MaPhi=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, khoanPhi.getTenPhi());
            preparedStatement.setString(2, khoanPhi.getLoaiPhi());
            preparedStatement.setDouble(3, khoanPhi.getDonGia());
            preparedStatement.setString(4, khoanPhi.getMaPhi());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static boolean checkMaPhi(String maPhi) {
        List<KhoanPhi> list = getListKhoanPhi();
        return list.contains(new KhoanPhi(maPhi));
    }

    public static boolean checkTenPhi(String tenPhi) {
        List<KhoanPhi> list = getListKhoanPhi();
        for (KhoanPhi khoanPhi : list) {
            if (khoanPhi.getTenPhi().equals(tenPhi)) return true;
        }
        return false;
    }

    public static List<KhoanPhi> find(String s, int type) {
        Connection connection = ConnectionUtils.getConnection();
        List<KhoanPhi> listKhoanPhi = new ArrayList<>();
        String sql;
        if (type == 0)
            sql = "Select * FROM KhoanPhi WHERE MaPhi LIKE N'%" + s + "%'";
        else if (type == 1)
            sql = "Select * FROM KhoanPhi WHERE TenPhi LIKE N'%" + s + "%'";
        else return listKhoanPhi;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                KhoanPhi khoanPhi = new KhoanPhi();
                khoanPhi.setMaPhi(resultSet.getString(1));
                khoanPhi.setTenPhi(resultSet.getString(2));
                khoanPhi.setLoaiPhi(resultSet.getString(3));
                khoanPhi.setDonGia(resultSet.getDouble(4));
                listKhoanPhi.add(khoanPhi);
            }
            return listKhoanPhi;
        } catch (SQLException e) {
            e.printStackTrace();
            return listKhoanPhi;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }
}

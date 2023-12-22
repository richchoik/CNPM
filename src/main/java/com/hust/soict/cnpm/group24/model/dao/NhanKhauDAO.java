package com.hust.soict.cnpm.group24.model.dao;

import com.hust.soict.cnpm.group24.connection.ConnectionUtils;
import com.hust.soict.cnpm.group24.model.entity.NhanKhau;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NhanKhauDAO {
    public static final int ID = 0;
    public static final int HO_TEN = 1;
    public static final int GIOI_TINH = 2;
    public static final int CCCD = 3;
    public static final int NGAY_SINH = 4;
    public static final int QUOC_TICH = 5;
    public static final int SDT = 6;
    public static final int MA_HO = 7;
    public static final int QUAN_HE_CHU_HO = 8;
    public static final int NAM_SINH = 9;

    public static List<NhanKhau> getListNhanKhau() {
        Connection connection = ConnectionUtils.getConnection();
        List<NhanKhau> list = new ArrayList<>();
        String sql = "SELECT * FROM NhanKhau";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                NhanKhau nhanKhau = new NhanKhau();
                nhanKhau.setId(resultSet.getString(1));
                nhanKhau.setHoTen(resultSet.getString(2));
                nhanKhau.setGioiTinh(resultSet.getString(3));
                nhanKhau.setCccd(resultSet.getString(4));
                nhanKhau.setNgaySinh(resultSet.getDate(5));
                nhanKhau.setQuocTich(resultSet.getString(6));
                nhanKhau.setSoDienThoai(resultSet.getString(7));
                nhanKhau.setMaHo(resultSet.getString(8));
                nhanKhau.setQuanHeChuHo(resultSet.getString(9));
                list.add(nhanKhau);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return list;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static boolean checkNhanKhau(String ID) {
        List<NhanKhau> list = getListNhanKhau();
        return list.contains(new NhanKhau(ID));
    }

    public static int addNhanKhau(NhanKhau nhanKhau) {
        Connection connection = ConnectionUtils.getConnection();
        String sql = "INSERT INTO NhanKhau VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nhanKhau.getId());
            preparedStatement.setString(2, nhanKhau.getHoTen());
            preparedStatement.setString(3, nhanKhau.getGioiTinh());
            preparedStatement.setString(4, nhanKhau.getCccd());
            preparedStatement.setDate(5, nhanKhau.getNgaySinh());
            preparedStatement.setString(6, nhanKhau.getQuocTich());
            preparedStatement.setString(7, nhanKhau.getSoDienThoai());
            preparedStatement.setString(8, nhanKhau.getMaHo());
            preparedStatement.setString(9, nhanKhau.getQuanHeChuHo());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static int delNhanKhau(String ID) {
        Connection connection = ConnectionUtils.getConnection();
        String sql = "DELETE FROM NhanKhau WHERE ID=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ID);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static int mdfNhanKhau(NhanKhau nhanKhau) {
        Connection connection = ConnectionUtils.getConnection();
        String sql = "UPDATE NhanKhau SET HoTen=?,GioiTinh=?,CCCD=?,NgaySinh=?,QuocTich=?,SDT=?,MaHo=?,QuanHeChuHo=? WHERE ID=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nhanKhau.getHoTen());
            preparedStatement.setString(2, nhanKhau.getGioiTinh());
            preparedStatement.setString(3, nhanKhau.getCccd());
            preparedStatement.setDate(4, nhanKhau.getNgaySinh());
            preparedStatement.setString(5, nhanKhau.getQuocTich());
            preparedStatement.setString(6, nhanKhau.getSoDienThoai());
            preparedStatement.setString(7, nhanKhau.getMaHo());
            preparedStatement.setString(8, nhanKhau.getQuanHeChuHo());
            preparedStatement.setString(9, nhanKhau.getId());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static List<NhanKhau> find(String s, int type) {
        Connection connection = ConnectionUtils.getConnection();
        List<NhanKhau> list = new ArrayList<>();
        String sql;
        switch (type) {
            case ID -> sql = "SELECT * FROM NhanKhau WHERE ID LIKE N'%" + s + "%'";
            case HO_TEN -> sql = "SELECT * FROM NhanKhau WHERE HoTen LIKE N'%" + s + "%'";
            case GIOI_TINH -> sql = "SELECT * FROM NhanKhau WHERE GioiTinh LIKE N'%" + s + "%'";
            case CCCD -> sql = "SELECT * FROM NhanKhau WHERE CCCD LIKE N'%" + s + "%'";
            case NGAY_SINH -> sql = "SELECT * FROM NhanKhau WHERE NgaySinh ='" + s + "'";
            case QUOC_TICH -> sql = "SELECT * FROM NhanKhau WHERE QuocTich LIKE N'%" + s + "%'";
            case SDT -> sql = "SELECT * FROM NhanKhau WHERE SDT LIKE N'%" + s + "%'";
            case MA_HO -> sql = "SELECT * FROM NhanKhau WHERE MaHo LIKE N'%" + s + "%'";
            case QUAN_HE_CHU_HO -> sql = "SELECT * FROM NhanKhau WHERE QuanHeChuHo LIKE N'%" + s + "%'";
            case NAM_SINH -> sql = "SELECT * FROM NhanKhau WHERE CAST(YEAR(NgaySinh) AS varchar) LIKE N'%" + s + "%'";
            default -> {
                return list;
            }
        }
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                NhanKhau nhanKhau = new NhanKhau();
                nhanKhau.setId(resultSet.getString(1));
                nhanKhau.setHoTen(resultSet.getString(2));
                nhanKhau.setGioiTinh(resultSet.getString(3));
                nhanKhau.setCccd(resultSet.getString(4));
                nhanKhau.setNgaySinh(resultSet.getDate(5));
                nhanKhau.setQuocTich(resultSet.getString(6));
                nhanKhau.setSoDienThoai(resultSet.getString(7));
                nhanKhau.setMaHo(resultSet.getString(8));
                nhanKhau.setQuanHeChuHo(resultSet.getString(9));
                list.add(nhanKhau);
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

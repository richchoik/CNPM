package com.hust.soict.cnpm.group24.model.dao;

import com.hust.soict.cnpm.group24.connection.ConnectionUtils;
import com.hust.soict.cnpm.group24.model.entity.HoKhau;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HoKhauDAO {
    public static final int MA_HO = 0;
    public static final int TEN_CHU_HO = 1;
    public static final int SO_THANH_VIEN = 2;
    public static final int SO_XE_MAY = 3;
    public static final int SO_O_TO = 4;

    public static List<HoKhau> getListHoKhau() {
        Connection connection = ConnectionUtils.getConnection();
        List<HoKhau> listHoKhau = new ArrayList<>();
        String sql = "Select * FROM HoKhau";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                HoKhau hoKhau = new HoKhau();
                hoKhau.setMaHo(resultSet.getString(1));
                hoKhau.setTenChuHo(resultSet.getString(2));
                hoKhau.setSoThanhVien(resultSet.getInt(3));
                hoKhau.setDienTich(resultSet.getDouble(4));
                hoKhau.setSoXe(resultSet.getInt(5));
                hoKhau.setSoOto(resultSet.getInt(6));
                listHoKhau.add(hoKhau);
            }
            return listHoKhau;
        } catch (SQLException e) {
            e.printStackTrace();
            return listHoKhau;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static int addHoKhau(HoKhau hoKhau) {
        Connection connection = ConnectionUtils.getConnection();
        String sql = "INSERT INTO HoKhau (MaHo, TenChuHo, DienTich, SoXe, SoOto) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, hoKhau.getMaHo());
            preparedStatement.setString(2, hoKhau.getTenChuHo());
            preparedStatement.setDouble(3, hoKhau.getDienTich());
            preparedStatement.setInt(4, hoKhau.getSoXe());
            preparedStatement.setInt(5, hoKhau.getSoOto());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static int delHoKhau(String maHo) {
        Connection connection = ConnectionUtils.getConnection();
        String sql = "DELETE FROM HoKhau WHERE MaHo=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maHo);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static int mdfHoKhau(HoKhau hoKhau) {
        Connection connection = ConnectionUtils.getConnection();
        String sql = "UPDATE HoKhau SET TenChuHo=?,DienTich=?,SoXe=?,SoOto=? WHERE MaHo=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, hoKhau.getTenChuHo());
            preparedStatement.setDouble(2, hoKhau.getDienTich());
            preparedStatement.setInt(3, hoKhau.getSoXe());
            preparedStatement.setInt(4, hoKhau.getSoOto());
            preparedStatement.setString(5, hoKhau.getMaHo());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static boolean checkHoKhau(String maHo) {
        List<HoKhau> list = getListHoKhau();
        return list.contains(new HoKhau(maHo));
    }

    public static List<HoKhau> find(String name, int type) {
        Connection connection = ConnectionUtils.getConnection();
        List<HoKhau> listHoKhau = new ArrayList<>();
        String sql;
        if (type == MA_HO)
            sql = "Select * FROM HoKhau WHERE MaHo LIKE N'%" + name + "%'";
        else if (type == TEN_CHU_HO)
            sql = "Select * FROM HoKhau WHERE TenChuHo LIKE N'%" + name + "%'";
        else return listHoKhau;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                HoKhau hoKhau = new HoKhau();
                hoKhau.setMaHo(resultSet.getString(1));
                hoKhau.setTenChuHo(resultSet.getString(2));
                hoKhau.setSoThanhVien(resultSet.getInt(3));
                hoKhau.setDienTich(resultSet.getDouble(4));
                hoKhau.setSoXe(resultSet.getInt(5));
                hoKhau.setSoOto(resultSet.getInt(6));
                listHoKhau.add(hoKhau);
            }
            return listHoKhau;
        } catch (SQLException e) {
            e.printStackTrace();
            return listHoKhau;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static List<HoKhau> find(int number, int type) {
        Connection connection = ConnectionUtils.getConnection();
        List<HoKhau> listHoKhau = new ArrayList<>();
        String sql;
        if (type == SO_THANH_VIEN)
            sql = "Select * FROM HoKhau WHERE SoThanhVien LIKE N'%" + number + "%'";
        else if (type == SO_XE_MAY)
            sql = "Select * FROM HoKhau WHERE SoXe LIKE N'%" + number + "%'";
        else if (type == SO_O_TO)
            sql = "Select * FROM HoKhau WHERE SoOto LIKE N'%" + number + "%'";
        else return listHoKhau;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                HoKhau hoKhau = new HoKhau();
                hoKhau.setMaHo(resultSet.getString(1));
                hoKhau.setTenChuHo(resultSet.getString(2));
                hoKhau.setSoThanhVien(resultSet.getInt(3));
                hoKhau.setDienTich(resultSet.getDouble(4));
                hoKhau.setSoXe(resultSet.getInt(5));
                hoKhau.setSoOto(resultSet.getInt(6));
                listHoKhau.add(hoKhau);
            }
            return listHoKhau;
        } catch (SQLException e) {
            e.printStackTrace();
            return listHoKhau;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static List<HoKhau> find(double dienTich) {
        Connection connection = ConnectionUtils.getConnection();
        List<HoKhau> listHoKhau = new ArrayList<>();
        String sql = "Select * FROM HoKhau WHERE DienTich = " + dienTich;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                HoKhau hoKhau = new HoKhau();
                hoKhau.setMaHo(resultSet.getString(1));
                hoKhau.setTenChuHo(resultSet.getString(2));
                hoKhau.setSoThanhVien(resultSet.getInt(3));
                hoKhau.setDienTich(resultSet.getDouble(4));
                hoKhau.setSoXe(resultSet.getInt(5));
                hoKhau.setSoOto(resultSet.getInt(6));
                listHoKhau.add(hoKhau);
            }
            return listHoKhau;
        } catch (SQLException e) {
            e.printStackTrace();
            return listHoKhau;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

}

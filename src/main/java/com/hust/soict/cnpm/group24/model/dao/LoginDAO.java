package com.hust.soict.cnpm.group24.model.dao;

import com.hust.soict.cnpm.group24.connection.ConnectionUtils;

import java.sql.*;

public class LoginDAO {
    public static boolean login(String userName,String password){
        Connection connection = ConnectionUtils.getConnection();
        try {
            String sql = "SELECT COUNT(*) FROM TaiKhoan WHERE UserName=? AND Password=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet!=null){
                resultSet.next();
                return resultSet.getInt(1) == 1;
            }
            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static boolean addUser(String userName,String password){
        Connection connection = ConnectionUtils.getConnection();
        try {
            String sql = "INSERT INTO TaiKhoan VALUES(?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            return !preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static boolean deleteUser(String userName){
        Connection connection = ConnectionUtils.getConnection();
        try {
            String sql = "DELETE FROM TaiKhoan WHERE UserName=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            return !preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally {
            ConnectionUtils.closeConnection(connection);
        }
    }
}

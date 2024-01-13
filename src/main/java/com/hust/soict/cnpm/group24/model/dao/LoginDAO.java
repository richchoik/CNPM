package com.hust.soict.cnpm.group24.model.dao;

import com.hust.soict.cnpm.group24.connection.ConnectionUtils;
import com.hust.soict.cnpm.group24.model.entity.HoKhau;
import com.hust.soict.cnpm.group24.model.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public static List<User> getListUser(){
        Connection connection = ConnectionUtils.getConnection();
        List<User> userList = new ArrayList<>();
        String sql = "Select * FROM TaiKhoan";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                User user = new User();
                user.setUserName(resultSet.getString(1));
                user.setChuTaiKhoan(resultSet.getString(3));
                userList.add(user);
            }
            return userList;
        } catch (SQLException e) {
            e.printStackTrace();
            return userList;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static int addUser(User user){
        Connection connection = ConnectionUtils.getConnection();
        try {
            String sql = "INSERT INTO TaiKhoan VALUES(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getChuTaiKhoan());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static int deleteUser(String userName){
        Connection connection = ConnectionUtils.getConnection();
        try {
            String sql = "DELETE FROM TaiKhoan WHERE UserName=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }finally {
            ConnectionUtils.closeConnection(connection);
        }
    }
    
    public static boolean checkUser(String userName) {
        Connection connection = ConnectionUtils.getConnection();
        String sql = "Select COUNT(*) FROM TaiKhoan WHERE UserName = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            ResultSet resultSet = preparedStatement.executeQuery(sql);
            int num = 1;
            while (resultSet.next()) {
                num = resultSet.getInt(1);
            }
            return num > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return true;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }
}

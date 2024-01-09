package com.hust.soict.cnpm.group24.model.dao;

import com.hust.soict.cnpm.group24.connection.ConnectionUtils;
import com.hust.soict.cnpm.group24.model.entity.HoKhau;
import com.hust.soict.cnpm.group24.model.entity.KhoanPhi;
import com.hust.soict.cnpm.group24.model.entity.NhanKhau;
import com.hust.soict.cnpm.group24.model.entity.NopPhi;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NopPhiDAO {
    public static final int MA_HO = 0;
    public static final int MA_PHI = 1;
    public static final int NGAY_DONG = 2;

    public static List<NopPhi> getListNopPhi() {
        Connection connection = ConnectionUtils.getConnection();
        List<NopPhi> list = new ArrayList<>();
        String sql = "SELECT * FROM NopPhi ORDER BY NgayDong DESC";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                NopPhi nopPhi = new NopPhi();
                nopPhi.setMaHo(resultSet.getString(1));
                nopPhi.setMaPhi(resultSet.getString(2));
                nopPhi.setTenNguoiDong(resultSet.getString(3));
                nopPhi.setTenPhi(resultSet.getString(4));
                nopPhi.setSoTien(resultSet.getDouble(5));
                nopPhi.setNgayDong(resultSet.getDate(6));
                list.add(nopPhi);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return list;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static int addNopPhi(NopPhi nopPhi) {
        Connection connection = ConnectionUtils.getConnection();
        String sql = "INSERT INTO NopPhi VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nopPhi.getMaHo());
            preparedStatement.setString(2, nopPhi.getMaPhi());
            preparedStatement.setString(3, nopPhi.getTenNguoiDong());
            preparedStatement.setString(4, nopPhi.getTenPhi());
            preparedStatement.setDouble(5, nopPhi.getSoTien());
            preparedStatement.setDate(6, nopPhi.getNgayDong());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static int delNopPhi(NopPhi nopPhi) {
        Connection connection = ConnectionUtils.getConnection();
        String sql = "DELETE FROM NopPhi WHERE MaHo=? AND MaPhi=? AND NgayDong=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nopPhi.getMaHo());
            preparedStatement.setString(2, nopPhi.getMaPhi());
            preparedStatement.setDate(3, nopPhi.getNgayDong());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static int mdfNopPhi(NopPhi nopPhi) {
        Connection connection = ConnectionUtils.getConnection();
        String sql = "UPDATE NopPhi SET TenNguoiDong=?,SoTien=?,NgayDong=? WHERE MaHo=? AND MaPhi=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nopPhi.getTenNguoiDong());
            preparedStatement.setDouble(2, nopPhi.getSoTien());
            preparedStatement.setDate(3, nopPhi.getNgayDong());
            preparedStatement.setString(4, nopPhi.getMaHo());
            preparedStatement.setString(5, nopPhi.getMaPhi());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }

    public static boolean checkNopPhi(NopPhi nopPhi) {
        List<NopPhi> list = getListNopPhi();
        return list.contains(nopPhi);
    }

    public static List<NopPhi> findNopPhi(String s, int type) {
        Connection connection = ConnectionUtils.getConnection();
        List<NopPhi> list = new ArrayList<>();
        String sql;
        switch (type) {
            case MA_HO -> sql = "SELECT * FROM NopPhi WHERE MaHo LIKE N'%" + s + "%' ORDER BY NgayDong DESC";
            case MA_PHI -> sql = "SELECT * FROM NopPhi WHERE MaPhi LIKE N'%" + s + "%' ORDER BY NgayDong DESC";
            case NGAY_DONG -> sql = "SELECT * FROM NopPhi WHERE NgayDong LIKE '%" + s + "%' ORDER BY NgayDong DESC";
            default -> {
                return list;
            }
        }
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                NopPhi nopPhi = new NopPhi();
                nopPhi.setMaHo(resultSet.getString(1));
                nopPhi.setMaPhi(resultSet.getString(2));
                nopPhi.setTenNguoiDong(resultSet.getString(3));
                nopPhi.setTenPhi(resultSet.getString(4));
                nopPhi.setSoTien(resultSet.getDouble(5));
                nopPhi.setNgayDong(resultSet.getDate(6));
                list.add(nopPhi);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return list;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }


    public static double getSoTienPhaiDong(String maHo, String maPhi) {
        Connection connection = ConnectionUtils.getConnection();
        try {
            Statement statement1 = connection.createStatement();
            List<HoKhau> listHoKhau = HoKhauDAO.find(maHo, HoKhauDAO.MA_HO);
            HoKhau hoKhau = listHoKhau.get(0);
            List<KhoanPhi> listKhoanPhi = KhoanPhiDAO.find(maPhi, KhoanPhiDAO.MA_PHI);
            KhoanPhi khoanPhi = listKhoanPhi.get(0);
            if (khoanPhi.getLoaiPhi().equals("Sinh hoạt") || khoanPhi.getLoaiPhi().equals("Tự nguyện")) return 0;
            else if (khoanPhi.getLoaiPhi().equals("Bắt buộc")) return hoKhau.getDienTich() * khoanPhi.getDonGia();
            else if (khoanPhi.getLoaiPhi().equals("Phí gửi xe máy")) return hoKhau.getSoXe() * khoanPhi.getDonGia();
            else if (khoanPhi.getLoaiPhi().equals("Phí gửi ô tô")) return hoKhau.getSoOto() * khoanPhi.getDonGia();
            else return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeConnection(connection);
        }
    }
}

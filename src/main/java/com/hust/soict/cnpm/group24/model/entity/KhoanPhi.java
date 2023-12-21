package com.hust.soict.cnpm.group24.model.entity;

public class KhoanPhi {
    private String maKhoanThu;
    private String tenKhoanThu;
    private String loaiKhoanThu;
    private float donGia;

    public KhoanPhi(String maKhoanThu, String tenKhoanThu, String loaiKhoanThu, float donGia) {
        this.maKhoanThu = maKhoanThu;
        this.tenKhoanThu = tenKhoanThu;
        this.loaiKhoanThu = loaiKhoanThu;
        this.donGia = donGia;
    }

    public String getMaKhoanThu() {
        return maKhoanThu;
    }

    public void setMaKhoanThu(String maKhoanThu) {
        this.maKhoanThu = maKhoanThu;
    }

    public String getTenKhoanThu() {
        return tenKhoanThu;
    }

    public void setTenKhoanThu(String tenKhoanThu) {
        this.tenKhoanThu = tenKhoanThu;
    }

    public String getLoaiKhoanThu() {
        return loaiKhoanThu;
    }

    public void setLoaiKhoanThu(String loaiKhoanThu) {
        this.loaiKhoanThu = loaiKhoanThu;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    
    
    
}

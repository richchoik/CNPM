package com.hust.soict.cnpm.group24.model.entity;

public class NhanKhau {
    private String id;
    private String hoTen;
    private String cccd;
    private String ngaySinh;
    private String soDienThoai;

    public NhanKhau(String id, String hoTen, String cccd, String ngaySinh) {
        this.id = id;
        this.hoTen = hoTen;
        this.cccd = cccd;
        this.ngaySinh = ngaySinh;
    }

    public NhanKhau(String id, String hoTen, String cccd, String ngaySinh, String soDienThoai) {
        this.id = id;
        this.hoTen = hoTen;
        this.cccd = cccd;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}

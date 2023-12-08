package com.hust.soict.cnpm.group24.model.entity;

public class HoKhau {
    private String maHo;
    private String idChuHo;
    private int soThanhVien;
    private double dienTich;

    public HoKhau(String maHo, String idChuHo, double dienTich) {
        this.maHo = maHo;
        this.idChuHo = idChuHo;
        this.dienTich = dienTich;
    }

    public String getMaHo() {
        return maHo;
    }

    public void setMaHo(String maHo) {
        this.maHo = maHo;
    }

    public String getIdChuHo() {
        return idChuHo;
    }

    public void setIdChuHo(String idChuHo) {
        this.idChuHo = idChuHo;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
}

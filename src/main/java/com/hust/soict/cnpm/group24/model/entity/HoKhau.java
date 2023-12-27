package com.hust.soict.cnpm.group24.model.entity;

import java.util.Objects;

public class HoKhau {
    private String maHo;
    private String tenChuHo;
    private int soThanhVien;
    private double dienTich;
    private int soXe = 5;
    private int soOto = 3;

    public String getMaHo() {
        return maHo;
    }

    public void setMaHo(String maHo) {
        this.maHo = maHo;
    }

    public String getTenChuHo() {
        return tenChuHo;
    }

    public void setTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
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

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public int getSoOto() {
        return soOto;
    }

    public void setSoOto(int soOto) {
        this.soOto = soOto;
    }

    public HoKhau() {
    }

    public HoKhau(String maHo) {
        this.maHo = maHo;
    }

    public HoKhau(String maHo, String tenChuHo, double dienTich) {
        this.maHo = maHo;
        this.tenChuHo = tenChuHo;
        this.dienTich = dienTich;
    }

    public HoKhau(String maHo, String tenChuHo, double dienTich, int soXe, int soOto) {
        this.maHo = maHo;
        this.tenChuHo = tenChuHo;
        this.dienTich = dienTich;
        this.soXe = soXe;
        this.soOto = soOto;
    }

    @Override
    public String toString() {
        return "HoKhau{" +
                "maHo='" + maHo + '\'' +
                ", tenChuHo='" + tenChuHo + '\'' +
                ", soThanhVien=" + soThanhVien +
                ", dienTich=" + dienTich +
                ", soXe=" + soXe +
                ", soOto=" + soOto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoKhau hoKhau = (HoKhau) o;
        return Objects.equals(maHo, hoKhau.maHo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maHo);
    }
}

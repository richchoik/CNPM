package com.hust.soict.cnpm.group24.model.entity;

import java.sql.Date;
import java.util.Objects;

public class NhanKhau {
    private String id;
    private String hoTen;
    private String gioiTinh;
    private String cccd;
    private String quocTich;
    private Date ngaySinh;
    private String soDienThoai;
    private String maHo;
    private String quanHeChuHo;

    public NhanKhau() {
    }

    public NhanKhau(String id) {
        this.id = id;
    }

    public NhanKhau(String id, String hoTen, String gioiTinh, String cccd, String quocTich, Date ngaySinh, String soDienThoai, String maHo, String quanHeChuHo) {
        this.id = id;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.cccd = cccd;
        this.quocTich = quocTich;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.maHo = maHo;
        this.quanHeChuHo = quanHeChuHo;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getMaHo() {
        return maHo;
    }

    public void setMaHo(String maHo) {
        this.maHo = maHo;
    }

    public String getQuanHeChuHo() {
        return quanHeChuHo;
    }

    public void setQuanHeChuHo(String quanHeChuHo) {
        this.quanHeChuHo = quanHeChuHo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NhanKhau nhanKhau = (NhanKhau) o;
        return Objects.equals(id, nhanKhau.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "NhanKhau{" +
                "id='" + id + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", cccd='" + cccd + '\'' +
                ", quocTich='" + quocTich + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", maHo='" + maHo + '\'' +
                ", quanHeChuHo='" + quanHeChuHo + '\'' +
                '}';
    }
}

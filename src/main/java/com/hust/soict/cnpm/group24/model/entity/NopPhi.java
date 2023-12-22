package com.hust.soict.cnpm.group24.model.entity;

import java.sql.Date;
import java.util.Objects;

public class NopPhi {
    private String maHo;
    private String maPhi;
    private String tenNguoiDong;
    private String tenPhi;
    private double soTien;
    private Date ngayDong;

    public NopPhi() {
    }

    public NopPhi(String maHo, String maPhi, String tenNguoiDong, String tenPhi, double soTien, Date ngayDong) {
        this.maHo = maHo;
        this.maPhi = maPhi;
        this.tenNguoiDong = tenNguoiDong;
        this.tenPhi = tenPhi;
        this.soTien = soTien;
        this.ngayDong = ngayDong;
    }

    public String getMaHo() {
        return maHo;
    }

    public void setMaHo(String maHo) {
        this.maHo = maHo;
    }

    public String getMaPhi() {
        return maPhi;
    }

    public void setMaPhi(String maPhi) {
        this.maPhi = maPhi;
    }

    public String getTenNguoiDong() {
        return tenNguoiDong;
    }

    public void setTenNguoiDong(String tenNguoiDong) {
        this.tenNguoiDong = tenNguoiDong;
    }

    public String getTenPhi() {
        return tenPhi;
    }

    public void setTenPhi(String tenPhi) {
        this.tenPhi = tenPhi;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public Date getNgayDong() {
        return ngayDong;
    }

    public void setNgayDong(Date ngayDong) {
        this.ngayDong = ngayDong;
    }

    @Override
    public String toString() {
        return "NopPhi{" +
                "maHo='" + maHo + '\'' +
                ", maPhi='" + maPhi + '\'' +
                ", tenNguoiDong='" + tenNguoiDong + '\'' +
                ", tenPhi='" + tenPhi + '\'' +
                ", soTien=" + soTien +
                ", ngayDong=" + ngayDong +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NopPhi nopPhi = (NopPhi) o;
        return Objects.equals(maHo, nopPhi.maHo) && Objects.equals(maPhi, nopPhi.maPhi) && Objects.equals(ngayDong, nopPhi.ngayDong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maHo, maPhi, ngayDong);
    }
}

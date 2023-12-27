package com.hust.soict.cnpm.group24.model.entity;

import java.util.Objects;

public class KhoanPhi {
    private String maPhi;
    private String tenPhi;
    private String loaiPhi;
    private double donGia;

    public KhoanPhi() {
    }

    public KhoanPhi(String maPhi) {
        this.maPhi = maPhi;
    }

    public KhoanPhi(String maPhi, String tenPhi, String loaiPhi, double donGia) {
        this.maPhi = maPhi;
        this.tenPhi = tenPhi;
        this.loaiPhi = loaiPhi;
        this.donGia = donGia;
    }

    public String getMaPhi() {
        return maPhi;
    }

    public void setMaPhi(String maPhi) {
        this.maPhi = maPhi;
    }

    public String getTenPhi() {
        return tenPhi;
    }

    public void setTenPhi(String tenPhi) {
        this.tenPhi = tenPhi;
    }

    public String getLoaiPhi() {
        return loaiPhi;
    }

    public void setLoaiPhi(String loaiPhi) {
        this.loaiPhi = loaiPhi;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "KhoanPhi{" +
                "maPhi='" + maPhi + '\'' +
                ", tenPhi='" + tenPhi + '\'' +
                ", loaiPhi='" + loaiPhi + '\'' +
                ", DonGia=" + donGia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KhoanPhi khoanPhi = (KhoanPhi) o;
        return Objects.equals(maPhi, khoanPhi.maPhi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maPhi);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hust.soict.cnpm.group24.model;

/**
 *
 * @author LENOVO
 */
public class GiaoVien {
    private String id;
    private String name;
    private String luong;
    private String phai;
    private String ngaySinh;
    private String diaChi;
    private String GVQL;
    private String BM;

    public GiaoVien(String id, String name, String luong, String phai, String ngaySinh, String diaChi, String GVQL, String BM) {
        this.id = id;
        this.name = name;
        this.luong = luong;
        this.phai = phai;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.GVQL = GVQL;
        this.BM = BM;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGVQL() {
        return GVQL;
    }

    public void setGVQL(String GVQL) {
        this.GVQL = GVQL;
    }

    public String getBM() {
        return BM;
    }

    public void setBM(String BM) {
        this.BM = BM;
    }
}

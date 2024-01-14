--***Version 1.0***
CREATE DATABASE QuanLyChungCu
GO
USE QuanLyChungCu
GO
--Tạo bảng chứ thông tin đăng nhập
CREATE TABLE TaiKhoan(
  UserName nvarchar(100) PRIMARY KEY,
  Password nvarchar(100) NOT NULL,
  ChuTaiKhoan nvarchar(100) NOT NULL
)
go  
--Tạo bảng hộ khẩu
CREATE TABLE HoKhau(
  	MaHo varchar(10) PRIMARY KEY,
  	TenChuHo nvarchar(100) NOT NULL,
  	SoThanhVien int DEFAULT 0,
  	DienTich float NOT NULL,
  	SoXe int DEFAULT 0,
  	SoOto int DEFAULT 0
)
GO  
--Tạo bảng nhân khẩu
CREATE TABLE NhanKhau(
  ID varchar(20) PRIMARY Key,
  HoTen nvarchar(100) NOT NULL,
  GioiTinh nvarchar(10) NOT NULL,
  CCCD varchar(30) NOT NULL UNIQUE,
  NgaySinh DATE NOT NULL,
  QuocTich nvarchar(100) NOT NULL,
  SDT varchar(20),
  MaHo varchar(10) NOT NULL,
  QuanHeChuHo nvarchar(50) NOT NULL,
  FOREIGN KEY (MaHo) REFERENCES HoKhau(MaHo)
)
GO
--Tạo bảng các khoản phí
CREATE TABLE KhoanPhi(
  MaPhi varchar(10) PRIMARY Key,
  TenPhi nvarchar(100) NOT NULL,
  LoaiPhi nvarchar(20) NOT NULL,
  --Dùng JCombobox chọn 5 loại: Bắt buộc, Sinh hoạt, Tự nguyện, Phí gửi xe máy, Phí gửi ô tô
  DonGia float
)
GO  
--Tạo bảng thu phí
CREATE TABLE NopPhi(
  MaHo varchar(10),
  MaPhi varchar(10),
  TenNguoiDong nvarchar(100),
  TenPhi nvarchar(100) NOT NULL,
  SoTien float NOT NULL,
  NgayDong date NOT NULL,
  PRIMARY KEY (MaHo,MaPhi),
  FOREIGN KEY (MaHo) REFERENCES HoKhau(MaHo),
  FOREIGN KEY (MaPhi) REFERENCES KhoanPhi(MaPhi),
)
GO

CREATE TRIGGER tg_SoThanhVien on NhanKhau
FOR INSERT,DELETE,UPDATE
AS
BEGIN
	DECLARE @num_add int,@num_del int
    SELECT @num_add = Count(*) FROM inserted
    SELECT @num_del = COUNT(*) From deleted
    
    if(@num_add = 1 AND @num_del = 1)
    BEGIN
    	UPDATE HoKhau
        SET SoThanhVien = SoThanhVien + 1 
        WHERE MaHo IN (SELECT MaHo from inserted);
        
        UPDATE HoKhau
        SET SoThanhVien = SoThanhVien - 1 
        WHERE MaHo IN (SELECT MaHo from deleted);
    END
    
    IF(@num_add = 1 AND @num_del = 0)
        UPDATE HoKhau
        SET SoThanhVien = SoThanhVien + 1 
        WHERE MaHo IN (SELECT MaHo from inserted);
    
    IF(@num_add = 0 AND @num_del = 1)
    	UPDATE HoKhau
        SET SoThanhVien = SoThanhVien - 1 
        WHERE MaHo IN (SELECT MaHo from deleted);
END



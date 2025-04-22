package edu.uth.wed_san_pham_cham_soc_da.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime; // Thêm import LocalDateTime
import java.util.List;

@Entity
public class Pay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDH")
    private Long maDH;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UserID", nullable = false)
    private Account userID;

    @Nationalized
    @Column(name = "TenKhachHang", nullable = false, length = 50)
    private String tenKhachHang;

    @Column(name = "SoDienThoai", nullable = false, length = 15)
    private String soDienThoai;

    @Column(name = "Email", nullable = false, length = 50)
    private String email;

    @Nationalized
    @Column(name = "PTTT", nullable = false, length = 50)
    private String pttt;

    @Nationalized
    @Column(name = "DiaChi", length = 100)
    private String diaChi;

    @Column(name = "NgaySinh")
    private LocalDate ngaySinh;

    @Column(name = "GiaTien")
    private Long giaTien;

    // Danh sách chi tiết đơn hàng
    @OneToMany(mappedBy = "pay", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderDetail> orderDetails;

    // Thêm trường createdAt để lưu thời gian tạo đơn hàng
    @CreationTimestamp
    @Column(name = "CreatedAt", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    // Getters và Setters
    public Long getMaDH() {
        return maDH;
    }

    public void setMaDH(Long maDH) {
        this.maDH = maDH;
    }

    public Account getUserID() {
        return userID;
    }

    public void setUserID(Account userID) {
        this.userID = userID;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPttt() {
        return pttt;
    }

    public void setPttt(String pttt) {
        this.pttt = pttt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Long getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Long giaTien) {
        this.giaTien = giaTien;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

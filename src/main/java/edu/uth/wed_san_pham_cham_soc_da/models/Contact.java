package edu.uth.wed_san_pham_cham_soc_da.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ContactID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UserID", referencedColumnName = "uID", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private edu.uth.wed_san_pham_cham_soc_da.models.Account userID;

    @Column(name = "Email", nullable = false, length = 30)
    private String email;

    @Nationalized
    @Column(name = "TenKhachHang", nullable = false, length = 20)
    private String tenKhachHang;

    @Nationalized
    @Column(name = "TenSanPham", length = 30)
    private String tenSanPham;

    @Nationalized
    @Column(name = "NoiDung", length = 250)
    private String noiDung;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public edu.uth.wed_san_pham_cham_soc_da.models.Account getUserID() {
        return userID;
    }

    public void setUserID(edu.uth.wed_san_pham_cham_soc_da.models.Account userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

}
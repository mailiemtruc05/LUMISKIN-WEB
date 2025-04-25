package edu.uth.wed_san_pham_cham_soc_da.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_id", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "subname", nullable = false, length = 50)
    private String subname;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cid", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Category cid;

    // Constructor mặc định
    public SubCategory() {}

    // Constructor có tham số
    public SubCategory(String subname, Category category) {
        this.subname = subname;
        this.cid = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public Category getCategory() {
        return cid;
    }

    public void setCategory(Category category) {
        this.cid = category;
    }

}
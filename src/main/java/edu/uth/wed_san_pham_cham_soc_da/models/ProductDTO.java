package edu.uth.wed_san_pham_cham_soc_da.models;

import java.math.BigDecimal;
import java.time.Instant;

public class ProductDTO {
    private Integer id;
    private String productName;
    private String image;
    private BigDecimal price;
    private String description;
    private Integer categoryId;
    private Integer subCategoryId;








    // Constructors
    public ProductDTO() {}

    public ProductDTO(Integer id, String productName, String image, BigDecimal price, String description, Integer categoryId, Integer subCategoryId) {
        this.id = id;
        this.productName = productName;
        this.image = image;
        this.price = price;
        this.description = description;
        this.categoryId = categoryId;
        this.subCategoryId = subCategoryId;
    }

    // Getters và Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }
}

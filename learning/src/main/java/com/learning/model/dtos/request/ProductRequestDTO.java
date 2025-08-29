package com.learning.model.dtos.request;

import com.learning.model.entities.Category;

public class ProductRequestDTO {
    private String productName;
    private String productDescription;
    private String sku;
    private String price;
    private Integer stock;
    private Boolean active;
    private String imageURL;
    private Long categoryId;

    public ProductRequestDTO() {
    }

    public ProductRequestDTO(String productName, String productDescription, String sku,
                             String price, Integer stock, Boolean active, String imageURL, Long categoryId) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.sku = sku;
        this.price = price;
        this.stock = stock;
        this.active = active;
        this.imageURL = imageURL;
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}

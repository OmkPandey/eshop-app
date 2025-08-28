package com.learning.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product extends BaseEntity{

    private String productName;

    private String productDescription;

    private String price;

    private Integer stock;

    private String imageURL;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public String getImageURL() {
        return imageURL;
    }

    public Category getCategory() {
        return category;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

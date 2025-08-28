package com.learning.model.dtos.request;

public class CategoryRequestDTO {
    private String categoryName;

    private String categoryDescription;

    private Long categoryParentId;  //Optional

    public CategoryRequestDTO(String categoryName, String categoryDescription, Long categoryParentId) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.categoryParentId = categoryParentId;
    }

    public CategoryRequestDTO() {
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public Long getCategoryParentId() {
        return categoryParentId;
    }

    public void setCategoryParentId(Long categoryParentId) {
        this.categoryParentId = categoryParentId;
    }
}

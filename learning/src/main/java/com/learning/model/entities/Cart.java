package com.learning.model.entities;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Cart extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = false)
    private List<CartItem> items;

    public User getUser() {
        return user;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

}

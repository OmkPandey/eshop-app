package com.learning.model.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Column(nullable = false, length = 40)
    private String firstName;

    @Column(length = 40)
    private String lastName;

    @Column(nullable = true, length = 20)
    private String password;

    private String userRole;        // Customer/Admin

    @Column(unique = true, nullable = false, length = 80)
    private String userEmail;

    @Column(nullable = false, length = 10)
    private String phoneNumber;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Address> addresses;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Cart cart;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> orders;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public Cart getCart() {
        return cart;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public String getPassword() {
        return password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}

package com.learning.model.dtos.request;

public class UserRequestDTO {

    private String firstName;
    private String lastName;
    private String password;
    private String userRole;        // Customer/Admin
    private String userEmail;
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserRole() {
        return userRole;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
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

    public UserRequestDTO(){
    }
    public UserRequestDTO(String firstName, String lastName, String userRole, String userEmail, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userRole = userRole;
        this.userEmail = userEmail;
        this.phoneNumber = phoneNumber;
    }
}

package com.learning.model.dtos.response;

import org.springframework.http.HttpStatus;

public class UserResponseDTO extends GenericResponseDTO{

    private String firstName;
    private String lastName;
    private String password;
    private String userRole;
    private String userEmail;
    private String phoneNumber;

    public UserResponseDTO(){
    }

    public UserResponseDTO(HttpStatus status, Object body, String message) {
        super(status, body, message);
    }

    public UserResponseDTO(HttpStatus status, String message){
        super(status, message);
    }

    // Getters and Setters for all fields
    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


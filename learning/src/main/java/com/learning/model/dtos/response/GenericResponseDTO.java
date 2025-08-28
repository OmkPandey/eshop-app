package com.learning.model.dtos.response;

import org.springframework.http.HttpStatus;

public class GenericResponseDTO {

    private HttpStatus status;

    private Object body;

    private String message;

    public GenericResponseDTO(HttpStatus status, Object body, String message) {
        this.status = status;
        this.body = body;
        this.message = message;
    }
    public GenericResponseDTO(HttpStatus status, String message){
        this.status = status;
        this.message = message;
    }

    public GenericResponseDTO() {
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

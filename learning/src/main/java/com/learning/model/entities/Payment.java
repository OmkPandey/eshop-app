package com.learning.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Payment extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private String paymentMethod;       //CARD,     UPI,    COD(Cash On Delivery )

    private String transactionId;       //

    private String status;      // SUCCESS, FAILED, PENDING

    public Order getOrder() {
        return order;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getStatus() {
        return status;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

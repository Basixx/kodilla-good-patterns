package com.kodilla.good.patterns.challenges.two;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private Product product;
    private LocalDateTime date;
    private double payment;

    public OrderRequest(User user, Product product, LocalDateTime date, double payment) {
        this.user = user;
        this.product = product;
        this.date = date;
        this.payment = payment;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public double getPayment() {
        return payment;
    }
}

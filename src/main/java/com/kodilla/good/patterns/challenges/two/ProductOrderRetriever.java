package com.kodilla.good.patterns.challenges.two;

import com.kodilla.good.patterns.challenges.two.auxiliary.OrderRetriever;

import java.time.LocalDateTime;

public class ProductOrderRetriever implements OrderRetriever {
    public OrderRequest retrieve(){
        User user = new User("John", "Smith");
        Product product = new Product("świeczka zapachowa", 70);
        LocalDateTime date = LocalDateTime.of(2021, 11,24, 18, 30);
        double payment = 78.92;

        return new OrderRequest(user, product, date, payment);
    }
}

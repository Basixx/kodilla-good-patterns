package com.kodilla.good.patterns.challenges.two;

import com.kodilla.good.patterns.challenges.two.auxiliary.OrderRepository;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {
    public boolean createOrder(User user, Product product, LocalDateTime date, double payment){
        System.out.println("Product order repository - Order: name: " + user.getName()+ " surname: " + user.getSurName()
               + " product " + product.getName()+ " price " + product.getPrice() +" date " + date.toString() + " payment "+  payment);
        return true;
    }
}

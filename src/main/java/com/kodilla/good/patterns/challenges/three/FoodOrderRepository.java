package com.kodilla.good.patterns.challenges.three;

import com.kodilla.good.patterns.challenges.three.supliers.Suplier;

public class FoodOrderRepository {
    public void createOrder(Suplier suplier, String item, int quantity){
        System.out.println("Order from: " + suplier.getSuplierName());
        System.out.println("Ordered item: " + item + ", ammount: "+ quantity);
    }
}

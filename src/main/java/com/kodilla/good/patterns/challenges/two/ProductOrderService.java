package com.kodilla.good.patterns.challenges.two;

import com.kodilla.good.patterns.challenges.two.auxiliary.OrderService;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    private final ProductOrderRepository productOrderRepository = new ProductOrderRepository();

    public boolean order(final User user, final Product product, final LocalDateTime orderDate, final double payment){

       if(productOrderRepository.createOrder(user, product, orderDate, payment)){
            System.out.println("Product order service - Order: name: " + user.getName()+ " surname: " + user.getSurName()
                    + " product " + product.getName()+ " price " + product.getPrice() +" date " + orderDate + " payment "+  payment);
            return true;
       }
       else {
           System.out.println("error");
           return  false;
       }
    }
}

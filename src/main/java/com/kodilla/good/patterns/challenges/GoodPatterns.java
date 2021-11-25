package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.one.MovieStore;
import com.kodilla.good.patterns.challenges.two.*;

public class GoodPatterns {
    public static void main(String[] args) {

        //first task
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore);
        System.out.println();

        //second task
        ProductOrderRetriever productOrderRetriever = new ProductOrderRetriever();
        OrderRequest request = productOrderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderRepository(),
                new ProductOrderService(new ProductOrderRepository()), new UserInformation());
        orderProcessor.process(request);
    }
}

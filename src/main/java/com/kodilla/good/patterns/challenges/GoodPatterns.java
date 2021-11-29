package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.one.MovieStore;
import com.kodilla.good.patterns.challenges.three.FoodRequest;
import com.kodilla.good.patterns.challenges.three.supliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.three.supliers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.three.supliers.HealthyShop;
import com.kodilla.good.patterns.challenges.three.Service;
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

        //third task
        System.out.println();
        Service service = new Service();

        HealthyShop healthyShop = new HealthyShop();
        healthyShop.setHealthyShop();

        FoodRequest foodRequest1 = new FoodRequest(healthyShop, "bread", 4);
        service.order(foodRequest1, healthyShop);

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        glutenFreeShop.setGlutenFreeShop();

        FoodRequest foodRequest2 = new FoodRequest(glutenFreeShop, "potato", 2);
        service.order(foodRequest2, glutenFreeShop);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.setExtraFoodShop();

        FoodRequest foodRequest3 = new FoodRequest(extraFoodShop, "pork", 35);
        service.order(foodRequest3, extraFoodShop);
    }
}

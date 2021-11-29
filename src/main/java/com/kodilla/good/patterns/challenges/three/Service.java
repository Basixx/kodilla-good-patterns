package com.kodilla.good.patterns.challenges.three;
import com.kodilla.good.patterns.challenges.three.supliers.Suplier;

public class Service {
    private FoodOrderRepository foodOrderRepository = new FoodOrderRepository();
    public void order(FoodRequest foodRequest, Suplier suplier){
        if(suplier.equals(foodRequest.getSuplier()) && suplier.getItemsAvailableMap().containsKey(foodRequest.getItem())) {
            if (foodRequest.getAmmount() <= suplier.getItemsAvailableMap().get(foodRequest.getItem())) {
                foodOrderRepository.createOrder(suplier, foodRequest.getItem(), foodRequest.getAmmount());
                suplier.process();
            } else {
                System.out.println("Not enough "+ foodRequest.getItem() + " to order");
            }

        } else {
            System.out.println("error - order incorrect");
        }
        System.out.println();
    }
}




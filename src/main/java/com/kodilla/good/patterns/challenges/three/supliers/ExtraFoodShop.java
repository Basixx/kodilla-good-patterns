package com.kodilla.good.patterns.challenges.three.supliers;

public class ExtraFoodShop extends Suplier{

    public void setExtraFoodShop(){
        suplierName = "ExtraFoodShop";
        itemsAvailableMap.put("beef", 30);
        itemsAvailableMap.put("pork", 28);
        itemsAvailableMap.put("tofu", 15);
    }
    public void process (){
        System.out.println("Invoices from ExtraShop sent by SMS");
    }
}

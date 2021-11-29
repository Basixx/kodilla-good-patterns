package com.kodilla.good.patterns.challenges.three.supliers;

public class GlutenFreeShop extends  Suplier{

    public void setGlutenFreeShop(){
        suplierName = "GlutenFreeShop";
        itemsAvailableMap.put("cornBread", 20);
        itemsAvailableMap.put("tomato", 90);
        itemsAvailableMap.put("fries", 25);
    }
    public void process (){
        System.out.println("Invoices from GlutenFreeShop sent by WattsApp");
    }
}

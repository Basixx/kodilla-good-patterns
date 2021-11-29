package com.kodilla.good.patterns.challenges.three.supliers;

public class HealthyShop extends  Suplier{

    public void setHealthyShop(){
        suplierName = "HealthyShop";
        itemsAvailableMap.put("bread", 10);
        itemsAvailableMap.put("milk", 12);
        itemsAvailableMap.put("eggs", 50);
    }
    public void process (){
        System.out.println("Invoices from HealthyShop sent by eMail");
    }
}

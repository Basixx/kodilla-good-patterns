package com.kodilla.good.patterns.challenges.three.supliers;

import java.util.HashMap;
import java.util.Map;

public class Suplier {
    String suplierName;
    Map<String, Integer> itemsAvailableMap = new HashMap<>();

    public String getSuplierName() {
        return suplierName;
    }

    public Map<String, Integer> getItemsAvailableMap() {
        return itemsAvailableMap;
    }

    public void process() {
        System.out.println("Order done");
    }
}

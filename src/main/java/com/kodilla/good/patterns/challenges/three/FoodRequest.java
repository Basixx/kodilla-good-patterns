package com.kodilla.good.patterns.challenges.three;

import com.kodilla.good.patterns.challenges.three.supliers.Suplier;

public class FoodRequest {

    private Suplier suplier;
    private String item;
    private Integer ammount;

    public FoodRequest(Suplier suplier, String item, Integer ammount) {
        this.suplier = suplier;
        this.item = item;
        this.ammount = ammount;
    }

    public Suplier getSuplier() {
        return suplier;
    }

    public String getItem() {
        return item;
    }

    public Integer getAmmount() {
        return ammount;
    }
}

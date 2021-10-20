package com.example.coffeeshop;

import java.util.Iterator;

public class  CoffeeModel {

    int minus,plus,image;
    String cost,name;

    public CoffeeModel(int minus, int plus, int image, String cost, String name) {

        this.minus = minus;
        this.plus = plus;
        this.image = image;
        this.cost = cost;
        this.name = name;

            }

    public int getMinus() {
        return minus;
    }

    public void setMinus(int minus) {
        this.minus = minus;
    }

    public int getPlus() {
        return plus;
    }

    public void setPlus(int plus) {
        this.plus = plus;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

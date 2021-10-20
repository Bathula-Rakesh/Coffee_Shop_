package com.example.coffeeshop;

public class HomeModel {
    int image;
    String name;
    String desc;

    public HomeModel(int image, String name, String desc) {

        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    public HomeModel(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

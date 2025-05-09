package com.example.cwiczenia2903.car.model;

public class Car {
    private String brandName;
    private String model;
    private String color;

    public Car(String brandName, String model, String color) {
        this.brandName = brandName;
        this.model = model;
        this.color = color;
    }

    public Car() {

    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getBrandName() {
        return brandName;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCarData() {
        return getBrandName() + " " + getModel() + " " + getColor();
    }
}


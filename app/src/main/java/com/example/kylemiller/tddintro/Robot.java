package com.example.kylemiller.tddintro;


public class Robot {

    private String name;
    private double battery;
    private String colour;

    public Robot(String name, String colour){
        this.name = name;
        this.colour = colour;
        this.battery = 100.0;
    }

    public String getName() {
        return name;
    }

    public double getBattery() {
        return battery;
    }

    public String getColour() {
        return colour;
    }

    public String makeDrink(String drink) {
        this.battery = this.battery - 10.0;
        return "I am making " + drink;
    }

    public String washDishes() {
        this.battery = this.battery - 30.0;
        return "I am washing the dishes";
    }

    public String doDusting() {
        this.battery = this.battery - 20.0;
        return "I am dusting";
    }

    public void rechargeBattery(){
        this.battery = 100.0;
    }

}

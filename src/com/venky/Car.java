package com.venky;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String colour;
    public void setColour(String colour){
        String valid = colour.toLowerCase();
        if(valid.equals("red")|| valid.equals("green") ){
            this.colour = colour;
        }
        else{
            this.colour =" not cotrrect";
        }

    }
    public String getColour(){

        return this.colour;
    }
}

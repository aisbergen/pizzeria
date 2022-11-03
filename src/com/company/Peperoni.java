package com.company;

public class Peperoni extends Pizza{

    @Override
    public String GetOrder() {
        return "Peperoni";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}

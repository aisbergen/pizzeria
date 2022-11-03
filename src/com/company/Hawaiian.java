package com.company;

public class Hawaiian extends Pizza{

    @Override
    public String GetOrder() {
        return "Hawaiian";
    }

    @Override
    public double cost() {
        return 3.99;
    }


    }

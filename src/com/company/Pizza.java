package com.company;

public abstract class Pizza  {
    String order="Unknown";

    public String GetOrder() {
        return order;
    }
    public abstract double cost();
}

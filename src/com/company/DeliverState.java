package com.company;

public class DeliverState implements PizzaState {
    Pizza pizza;
    @Override
    public void CheckState() {
        System.out.println("pizza is delivered");
    }
}

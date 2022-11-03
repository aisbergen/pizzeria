package com.company;

public class BakedState implements PizzaState{
    Pizza pizza;

    @Override
    public void CheckState() {
        System.out.println("pizza is baked");
    }
}

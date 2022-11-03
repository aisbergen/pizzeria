package com.company;

public abstract class CardStrategy implements PayStrategy{
    public CardStrategy() {
    }

    @Override
    public void Pay() {
        System.out.println("order was payed with credit card");
    }
}

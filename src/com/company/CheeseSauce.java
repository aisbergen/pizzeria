package com.company;

public class CheeseSauce extends IngredientDecorator  {
    public CheeseSauce(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String GetOrder() {
        return pizza.GetOrder()+" with cheese sauce";
    }

    @Override
    public double cost() {
        return pizza.cost()+0.49;
    }


}

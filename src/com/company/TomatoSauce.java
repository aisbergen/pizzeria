package com.company;

public class TomatoSauce extends IngredientDecorator {
public TomatoSauce(Pizza pizza){
    this.pizza=pizza;
}

    @Override
    public String GetOrder() {
        return pizza.GetOrder()+ " with tomato sauce";
    }

    @Override
    public double cost() {
        return pizza.cost()+0.49;
    }


}

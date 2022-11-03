package com.company;
public class Pizzamaker {
    private static String action="cooking";

    private static Pizzamaker pizzamaker;
    public static synchronized Pizzamaker getPizzamaker(){
    if(pizzamaker==null){
        pizzamaker=new Pizzamaker();
    }
    return pizzamaker;
    }
    private Pizzamaker(){}
    public void DoAction(){
        System.out.println(pizzamaker +" "+ action);
    }

}


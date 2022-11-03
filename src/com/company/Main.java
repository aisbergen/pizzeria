package com.company;

public class Main {

    public static void main(String[] args) {
        //decorator
	  Pizza pizza=new Peperoni();
      pizza=new CheeseSauce(pizza);
      System.out.println(pizza.GetOrder()+" $"+pizza.cost());
      Pizza pizza1=new Hawaiian();
      pizza1=new TomatoSauce(pizza1);
      System.out.println(pizza1.GetOrder()+" $"+pizza1.cost());

      //singleton
      Pizzamaker pizzamaker=Pizzamaker.getPizzamaker();
      pizzamaker.DoAction();

      //strategy
      System.out.println("Your order is done, how would like you to pay it?");
      PayStrategy card=new CardStrategy(){};
      PayStrategy QR=new QRStrategy() {};
      card.Pay();
      QR.Pay();

      //state
       PizzaState pizzaState=new DeliverState();
       PizzaState pizzaState1=new BakedState();
       pizzaState1.CheckState();
       pizzaState.CheckState();
       //observer
        MyTopic topic = new MyTopic();
        Observer observer1 = new Subscribers("Client1");
        Observer observer2 = new Subscribers("Client2");
        Observer observer3 = new Subscribers("Client3");
        topic.add(observer1);
        topic.add(observer2);
        topic.add(observer3);
        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);
        observer1.update();
        topic.postMessage("New pizza is out!");
    }


    }






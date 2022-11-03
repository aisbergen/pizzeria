package com.company;

public class Subscribers implements Observer{
    private String name;
    private Subject topic;

    public Subscribers(String name){
        this.name=name;
    }
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+": No new ads");
        }else
            System.out.println(name+": New ads:"+msg);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic=subject;
    }

}

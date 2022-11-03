package com.company;

public interface Subject {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyObservers();
    public Object getUpdate(Observer observer);
}

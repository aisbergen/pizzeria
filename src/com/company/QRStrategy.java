package com.company;

public abstract class QRStrategy implements PayStrategy {
    @Override
    public void Pay() {
        System.out.println("order was payed with QR");
    }
}

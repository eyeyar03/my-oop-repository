package com.abstraction;

public class Client {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.pay(500, 1);
    }
}

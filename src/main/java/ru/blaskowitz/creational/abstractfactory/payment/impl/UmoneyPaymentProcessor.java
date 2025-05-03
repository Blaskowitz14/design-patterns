package ru.blaskowitz.creational.abstractfactory.payment.impl;

import ru.blaskowitz.creational.abstractfactory.payment.PaymentProcessor;

public class UmoneyPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment() {
        System.out.println("processing Umoney payment");
    }
}

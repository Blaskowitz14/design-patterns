package ru.blaskowitz.creational.abstractfactory.payment.impl;

import ru.blaskowitz.creational.abstractfactory.payment.PaymentProcessor;

public class YdexPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("processing Ydex payment");
    }
}

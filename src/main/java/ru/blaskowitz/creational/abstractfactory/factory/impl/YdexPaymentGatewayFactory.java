package ru.blaskowitz.creational.abstractfactory.factory.impl;

import ru.blaskowitz.creational.abstractfactory.factory.PaymentGatewayFactory;
import ru.blaskowitz.creational.abstractfactory.payment.PaymentProcessor;
import ru.blaskowitz.creational.abstractfactory.payment.impl.YdexPaymentProcessor;
import ru.blaskowitz.creational.abstractfactory.reporter.TransactionReporter;
import ru.blaskowitz.creational.abstractfactory.reporter.impl.YdexTransactionReporter;
import ru.blaskowitz.creational.abstractfactory.subscription.SubscriptionManager;
import ru.blaskowitz.creational.abstractfactory.subscription.impl.YdexSubscriptionManager;

public class YdexPaymentGatewayFactory implements PaymentGatewayFactory {

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new YdexPaymentProcessor();
    }

    @Override
    public TransactionReporter createTransactionReporter() {
        return new YdexTransactionReporter();
    }

    @Override
    public SubscriptionManager createSubscriptionManager() {
        return new YdexSubscriptionManager();
    }
}

package ru.blaskowitz.creational.abstractfactory.factory.impl;

import ru.blaskowitz.creational.abstractfactory.factory.PaymentGatewayFactory;
import ru.blaskowitz.creational.abstractfactory.payment.PaymentProcessor;
import ru.blaskowitz.creational.abstractfactory.payment.impl.UmoneyPaymentProcessor;
import ru.blaskowitz.creational.abstractfactory.reporter.TransactionReporter;
import ru.blaskowitz.creational.abstractfactory.reporter.impl.UmoneyTransactionReporter;
import ru.blaskowitz.creational.abstractfactory.subscription.SubscriptionManager;
import ru.blaskowitz.creational.abstractfactory.subscription.impl.UmoneySubscriptionManager;

public class UmoneyPaymentGatewayFactory implements PaymentGatewayFactory {

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new UmoneyPaymentProcessor();
    }

    @Override
    public TransactionReporter createTransactionReporter() {
        return new UmoneyTransactionReporter();
    }

    @Override
    public SubscriptionManager createSubscriptionManager() {
        return new UmoneySubscriptionManager();
    }
}

package ru.blaskowitz.creational.abstractfactory.factory;

import ru.blaskowitz.creational.abstractfactory.payment.PaymentProcessor;
import ru.blaskowitz.creational.abstractfactory.reporter.TransactionReporter;
import ru.blaskowitz.creational.abstractfactory.subscription.SubscriptionManager;

public interface PaymentGatewayFactory {
    PaymentProcessor createPaymentProcessor();
    TransactionReporter createTransactionReporter();
    SubscriptionManager createSubscriptionManager();
}

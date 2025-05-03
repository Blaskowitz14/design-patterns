package ru.blaskowitz.creational.abstractfactory;

import ru.blaskowitz.creational.abstractfactory.factory.PaymentGatewayFactory;

public class AbstractFactoryUsage {
    public static void main(String[] args) {
        PaymentGatewayFactory factoryYdex = PaymentSystemFactory.get(PaymentSystemType.YDEX);

        factoryYdex.createPaymentProcessor().processPayment();
        factoryYdex.createTransactionReporter().generateReport();
        factoryYdex.createSubscriptionManager().createSubscription();

        PaymentGatewayFactory factoryUmoney = PaymentSystemFactory.get(PaymentSystemType.UMONEY);

        factoryUmoney.createPaymentProcessor().processPayment();
        factoryUmoney.createTransactionReporter().generateReport();
        factoryUmoney.createSubscriptionManager().createSubscription();
    }
}

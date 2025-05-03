package ru.blaskowitz.creational.abstractfactory;

import ru.blaskowitz.creational.abstractfactory.factory.PaymentGatewayFactory;
import ru.blaskowitz.creational.abstractfactory.factory.impl.UmoneyPaymentGatewayFactory;
import ru.blaskowitz.creational.abstractfactory.factory.impl.YdexPaymentGatewayFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentSystemFactory {

    private static final Map<PaymentSystemType, Supplier<PaymentGatewayFactory>> registry = new HashMap<>();

    static {
        register(PaymentSystemType.YDEX, YdexPaymentGatewayFactory::new);
        register(PaymentSystemType.UMONEY, UmoneyPaymentGatewayFactory::new);
    }

    public static void register(PaymentSystemType type, Supplier<PaymentGatewayFactory> supplier) {
        registry.put(type, supplier);
    }

    public static void unregister(PaymentSystemType type) {
        registry.remove(type);
    }

    public static void listAvailable() {
        System.out.println("Available systems: " + registry.keySet());
    }

    public static PaymentGatewayFactory get(PaymentSystemType type) {
        Supplier<PaymentGatewayFactory> supplier = registry.get(type);

        if (supplier == null) {
            throw new IllegalArgumentException("Payment type " + type + " not found");
        }

        return supplier.get();
    }
}

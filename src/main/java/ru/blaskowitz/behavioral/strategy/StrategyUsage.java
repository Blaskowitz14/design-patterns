package ru.blaskowitz.behavioral.strategy;

import ru.blaskowitz.behavioral.strategy.impl.CdekShippingStrategy;
import ru.blaskowitz.behavioral.strategy.impl.YdexDeliveryShippingStrategy;
import ru.blaskowitz.behavioral.strategy.order.Order;

import java.math.BigDecimal;

public class StrategyUsage {
    public static void main(String[] args) {
        Order order = new Order(BigDecimal.valueOf(3.5),
                                BigDecimal.valueOf(120));

        ShippingService shippingService = new ShippingService(
                new YdexDeliveryShippingStrategy());
        System.out.println(shippingService.calculateShipping(order));

        shippingService.setShippingStrategy(new CdekShippingStrategy());
        System.out.println(shippingService.calculateShipping(order));
    }
}

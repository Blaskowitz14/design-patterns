package ru.blaskowitz.behavioral.strategy.impl;

import ru.blaskowitz.behavioral.strategy.ShippingStrategy;
import ru.blaskowitz.behavioral.strategy.order.Order;

import java.math.BigDecimal;

public class YdexDeliveryShippingStrategy implements ShippingStrategy {
    private static final BigDecimal BASE_FEE = BigDecimal.valueOf(200.5);
    private static final BigDecimal KM_FEE = BigDecimal.valueOf(14.2);


    @Override
    public BigDecimal calculateShippingCost(Order order) {
        return BASE_FEE.add(KM_FEE.multiply(order.getDistance()));
    }
}

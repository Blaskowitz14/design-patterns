package ru.blaskowitz.behavioral.strategy.impl;

import ru.blaskowitz.behavioral.strategy.ShippingStrategy;
import ru.blaskowitz.behavioral.strategy.order.Order;

import java.math.BigDecimal;

public class CdekShippingStrategy implements ShippingStrategy {
    private final BigDecimal KG_FEE = BigDecimal.valueOf(124.49);
    private final BigDecimal KM_FEE = BigDecimal.valueOf(6.14);


    @Override
    public BigDecimal calculateShippingCost(Order order) {
        BigDecimal weightCost = KG_FEE.multiply(order.getWeight());
        BigDecimal distanceCost = KM_FEE.multiply(order.getDistance());
        return weightCost.add(distanceCost);
    }
}

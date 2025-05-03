package ru.blaskowitz.behavioral.strategy;

import ru.blaskowitz.behavioral.strategy.order.Order;

import java.math.BigDecimal;

public interface ShippingStrategy {
    BigDecimal calculateShippingCost(Order order);
}

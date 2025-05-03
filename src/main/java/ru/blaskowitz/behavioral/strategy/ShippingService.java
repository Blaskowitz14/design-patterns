package ru.blaskowitz.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;
import ru.blaskowitz.behavioral.strategy.order.Order;

import java.math.BigDecimal;

@AllArgsConstructor
@Setter
public class ShippingService {
    private ShippingStrategy shippingStrategy;

    public BigDecimal calculateShipping(Order order) {
        if (shippingStrategy == null) {
            throw new IllegalStateException("shipping strategy not set");
        }
        return shippingStrategy.calculateShippingCost(order);
    }
}

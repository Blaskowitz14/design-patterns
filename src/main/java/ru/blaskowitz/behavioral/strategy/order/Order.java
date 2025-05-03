package ru.blaskowitz.behavioral.strategy.order;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {
    private final BigDecimal weight;
    private final BigDecimal distance;
}

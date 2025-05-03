package ru.blaskowitz.creational.builder;

import java.math.BigDecimal;
import java.util.List;

public class BuilderUsage {
    public static void main(String[] args) {
        OrderDto order = new OrderDto.Builder()
                .id(111)
                .userId(222)
                .productIds(List.of(1L, 2L, 3L))
                .deliveryAddress("balaklavskiy")
                .phoneNumber("+79032084515")
                .paymentMethod("card")
                .totalPrice(BigDecimal.valueOf(1111.11))
                .build();

        System.out.println("order: " + order.toString());
    }
}

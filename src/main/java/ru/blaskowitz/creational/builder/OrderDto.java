package ru.blaskowitz.creational.builder;

import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class OrderDto {
    private final long id;
    private final long userId;
    private final List<Long> productIds;
    private final String deliveryAddress;
    private final String phoneNumber;
    private final String paymentMethod;
    private final BigDecimal totalPrice;

    public OrderDto(long id,
                    long userId,
                    List<Long> productIds,
                    String deliveryAddress,
                    String phoneNumber,
                    String paymentMethod,
                    BigDecimal totalPrice) {
        this.id = id;
        this.userId = userId;
        this.productIds = new ArrayList<>(productIds); // защитная копия
        this.deliveryAddress = deliveryAddress;
        this.phoneNumber = phoneNumber;
        this.paymentMethod = paymentMethod;
        this.totalPrice = totalPrice;
    }

    public OrderDto(Builder builder) {
        this.id = builder.id;
        this.userId = builder.userId;
        this.productIds = builder.productIds;
        this.deliveryAddress = builder.deliveryAddress;
        this.phoneNumber = builder.phoneNumber;
        this.paymentMethod = builder.paymentMethod;
        this.totalPrice = builder.totalPrice;
    }

    public static class Builder {
        private long id;
        private long userId;
        private List<Long> productIds;
        private String deliveryAddress;
        private String phoneNumber;
        private String paymentMethod;
        private BigDecimal totalPrice;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder userId(long userId) {
            this.userId = userId;
            return this;
        }

        public Builder productIds(List<Long> productIds) {
            this.productIds = productIds;
            return this;
        }

        public Builder deliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder totalPrice(BigDecimal totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public OrderDto build() {
            return new OrderDto(this);
        }
    }
}



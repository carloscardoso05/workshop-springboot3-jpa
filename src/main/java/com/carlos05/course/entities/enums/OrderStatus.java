package com.carlos05.course.entities.enums;
public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private final int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static OrderStatus valueOf(int code) throws IllegalAccessException {
        for (OrderStatus status: values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalAccessException("Invalid OrderStatus code");
    }
}

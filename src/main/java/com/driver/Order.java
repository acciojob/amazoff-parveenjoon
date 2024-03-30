package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, int deliveryTime) {
        this.id = id;
        this.deliveryTime = deliveryTime;
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }
}

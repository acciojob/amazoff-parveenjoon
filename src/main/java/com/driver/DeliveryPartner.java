package com.driver;

public class DeliveryPartner {

    private String id;
    private int numberOfOrders;

    public DeliveryPartner(String id) {
        this.id = id;
        this.numberOfOrders = 0;
    }

    public String getId() {
        return id;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void incrementNumberOfOrders() {
        this.numberOfOrders++;
    }

    public void decrementNumberOfOrders() {
        this.numberOfOrders--;
    }
}

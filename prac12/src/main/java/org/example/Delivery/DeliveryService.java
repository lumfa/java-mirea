package org.example.Delivery;

import org.example.Order.Order;

public abstract class DeliveryService {
    public abstract Order createOrder();
    public void deliver() {
        Order order = createOrder();
        System.out.println("Delivery in progress: " + order.getDescription());
    }
}

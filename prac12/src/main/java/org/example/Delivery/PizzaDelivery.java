package org.example.Delivery;

import org.example.Order.Order;
import org.example.Order.PizzaOrder;

public class PizzaDelivery extends DeliveryService {
    @Override
    public Order createOrder() {
        return new PizzaOrder();
    }
}
package org.example.Delivery;

import org.example.Order.Order;
import org.example.Order.SushiOrder;

public class SushiDelivery extends DeliveryService {
    @Override
    public Order createOrder() {
        return new SushiOrder();
    }
}

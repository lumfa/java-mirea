package org.example.Delivery;

import org.example.Order.GroceryOrder;
import org.example.Order.Order;

public class GroceryDelivery extends DeliveryService {
    @Override
    public Order createOrder() {
        return new GroceryOrder();
    }
}

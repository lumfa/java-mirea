package org.example.Order;

import org.example.Order.Order;

public class PizzaOrder extends Order {
    @Override
    public String getDescription() {
        return "Pizza Order";
    }
}

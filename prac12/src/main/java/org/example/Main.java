package org.example;


import org.example.Delivery.DeliveryService;
import org.example.Delivery.GroceryDelivery;
import org.example.Delivery.PizzaDelivery;
import org.example.Delivery.SushiDelivery;

public class Main {
    public static void main(String[] args) {
        DeliveryService pizzaService = new PizzaDelivery();
        pizzaService.deliver();

        DeliveryService groceryService = new GroceryDelivery();
        groceryService.deliver();

        DeliveryService sushiService = new SushiDelivery();
        sushiService.deliver();
    }
}
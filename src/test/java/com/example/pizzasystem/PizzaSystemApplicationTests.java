package com.example.pizzasystem;

import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.pizza.menu.Menu;
import com.example.pizzasystem.service.pizza.order.OrderHandler;
import com.example.pizzasystem.service.pizza.order.PizzaOrder;
import com.example.pizzasystem.service.pizza.order.order.AmericaStylePizzaStoreOrder;
import com.example.pizzasystem.service.pizza.order.order.Order;
import com.example.pizzasystem.service.pizza.store.AmericaStylePizzaStore;
import com.example.pizzasystem.service.pizza.store.ItalyStylePizzaStore;
import com.example.pizzasystem.service.pizza.store.PizzaStore;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class PizzaSystemApplicationTests {

    @Test
    void contextLoads() {
        PizzaStore pizzaStore = new ItalyStylePizzaStore();
        PizzaOrder pizzaOrder = new PizzaOrder();
        pizzaOrder.setType("Pepperoni");
        ArrayList<String> additions = new ArrayList<>();
        additions.add("Large Size");
        additions.add("More Cheese");
        additions.add("More Cheese");
        additions.add("More Pepperoni");
        additions.add("High Temperature");
        additions.add("Long Time");
        additions.add("10 Slices");
        additions.add("Dine");
        pizzaOrder.setAdditions(additions);

        List<PizzaOrder> pizzaOrders = new ArrayList<>();
        pizzaOrders.add(pizzaOrder);
        pizzaOrders.add(pizzaOrder);

        Order order = new AmericaStylePizzaStoreOrder(pizzaStore, pizzaOrders);
        OrderHandler orderHandler = new OrderHandler();
        orderHandler.setOrder(order);
        orderHandler.handleOrder();
    }

}

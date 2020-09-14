package com.example.pizzasystem.service.pizza.order.order;

import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.pizza.order.PizzaOrder;
import com.example.pizzasystem.service.pizza.store.AmericaStylePizzaStore;
import com.example.pizzasystem.service.pizza.store.PizzaStore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public class AmericaStylePizzaStoreOrder extends Order {

    public AmericaStylePizzaStoreOrder(PizzaStore pizzaStore, List<PizzaOrder> pizzaOrders) {
        this.pizzaStore = pizzaStore;
        this.pizzaOrders = pizzaOrders;
    }

    @Override
    public List<Pizza> execute() {
        return makePizzas();
    }
}

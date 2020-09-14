package com.example.pizzasystem.service.pizza.order.order;

import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.pizza.order.PizzaOrder;
import com.example.pizzasystem.service.store.AmericaStylePizzaStore;

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

    public AmericaStylePizzaStoreOrder(List<PizzaOrder> pizzaOrders) {
        this.pizzaStore = new AmericaStylePizzaStore();
        this.pizzaOrders = pizzaOrders;
    }

    @Override
    public List<Pizza> execute() {
        return makePizzas();
    }
}

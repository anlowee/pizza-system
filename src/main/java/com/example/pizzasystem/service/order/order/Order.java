package com.example.pizzasystem.service.order.order;

import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.order.BaseOrder;
import com.example.pizzasystem.service.store.PizzaStore;

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
public abstract class Order {

    /**
     * for which type of pizza store
     */
    protected PizzaStore pizzaStore;

    /**
     * the actual order passed in as a parameter
     */
    protected List<BaseOrder> baseOrders;

    public abstract List<Pizza> execute();

    protected List<Pizza> makePizzas() {
        List<Pizza> pizzas = new ArrayList<>();
        for (BaseOrder baseOrder : baseOrders) {
            Pizza pizza = pizzaStore.orderPizza(baseOrder);
            pizzas.add(pizza);
        }
        return pizzas;
    }

}

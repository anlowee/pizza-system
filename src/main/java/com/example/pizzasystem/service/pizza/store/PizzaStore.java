package com.example.pizzasystem.service.pizza.store;

import com.example.pizzasystem.service.pizza.component.Pizza;
import com.example.pizzasystem.service.pizza.order.PizzaOrder;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/11
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/11
 */
public abstract class PizzaStore {

    public Pizza orderPizza(PizzaOrder pizzaOrder) {
        Pizza pizza;
        pizza = createPizza(pizzaOrder);

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaOrder pizzaOrder);

}

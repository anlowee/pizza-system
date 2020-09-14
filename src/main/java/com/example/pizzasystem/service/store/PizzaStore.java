package com.example.pizzasystem.service.store;

import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.order.BaseOrder;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/11
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/11
 */
public abstract class PizzaStore {

    public Pizza orderPizza(BaseOrder baseOrder) {
        // first step is to choose a base-type of pizza in america-style
        Pizza pizza = createPizza(baseOrder);
        return pizza;
    }

    /**
     * factory method
     * @param baseOrder base pizza type
     * @return a pizzal
     */
    abstract Pizza createPizza(BaseOrder baseOrder);

}

package com.example.pizzasystem.service.pizza.store;

import com.example.pizzasystem.service.pizza.component.Pizza;
import com.example.pizzasystem.service.pizza.component.concretecomponent.america.AmericaStyleCheesePizza;
import com.example.pizzasystem.service.pizza.order.PizzaOrder;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/11
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/11
 */
public class AmericaStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaOrder pizzaOrder) {
        switch (pizzaOrder.getType()) {
            case "Cheese":
                return new AmericaStyleCheesePizza();
            default:
                break;
        }
        return null;
    }
}

package com.example.pizzasystem.service.pizza.order.order;

import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.pizza.order.PizzaOrder;
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
public abstract class Order {

    /**
     * for which type of pizza store
     */
    protected PizzaStore pizzaStore;

    /**
     * the actual order passed in as a parameter
     */
    protected List<PizzaOrder> pizzaOrders;

    public abstract List<Pizza> execute();

    protected List<Pizza> makePizzas() {
        List<Pizza> pizzas = new ArrayList<>();
        Double totCost = 0.0;
        for (PizzaOrder pizzaOrder : pizzaOrders) {
            System.out.println("##################################");
            Pizza pizza = pizzaStore.orderPizza(pizzaOrder);
            pizza.description();
            totCost += pizza.cost();
            pizzas.add(pizza);
        }
        System.out.println("##################################");
        System.out.printf("total cost: %.2f\n", totCost);
        return pizzas;
    }

}

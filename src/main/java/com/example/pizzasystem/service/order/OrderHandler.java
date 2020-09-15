package com.example.pizzasystem.service.order;

import com.example.pizzasystem.service.beverage.base.Beverage;
import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.order.order.Order;
import lombok.Setter;

import java.util.List;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public class OrderHandler {

    @Setter
    private Order pizzaOrder;
    @Setter
    private Order beverageOrder;

    public List<Pizza> handleOrder() {
        List<Pizza> foods = pizzaOrder.execute();
        foods.addAll(beverageOrder.execute());
        printReceipt(foods);
        return foods;
    }

    public void printReceipt(List<Pizza> foods) {
        System.out.println("##############RECEIPT##############");
        Double totCost = 0.0;
        for (Pizza food : foods) {
            System.out.println("##################################");
            food.description();
            totCost += food.cost();
        }
        System.out.println("##################################");
        System.out.printf("total cost: %.2f\n", totCost);
    }

}

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

    public String handleOrder() {
        List<Pizza> foods = null;
        if (pizzaOrder != null) {
            foods = pizzaOrder.execute();
        }
        if (beverageOrder != null) {
            if (foods == null) {
                foods = beverageOrder.execute();
            } else {
                foods.addAll(beverageOrder.execute());
            }
        }
        if (foods != null) {
            return printReceipt(foods);
        } else {
            return "No Order";
        }
    }

    public String printReceipt(List<Pizza> foods) {
        StringBuilder receipt = new StringBuilder("##############RECEIPT##############\n");
        Double totCost = 0.0;
        for (Pizza food : foods) {
            receipt.append("##################################\n");
            receipt.append(food.description());
            totCost += food.cost();
        }
        receipt.append("##################################\n")
                .append(String.format("total cost: %.2f\n", totCost));
        System.out.println(receipt.toString());
        return receipt.toString();
    }

}

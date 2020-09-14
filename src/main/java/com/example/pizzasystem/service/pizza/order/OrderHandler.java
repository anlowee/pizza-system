package com.example.pizzasystem.service.pizza.order;

import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.pizza.order.order.Order;
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
    private Order order;

    public List<Pizza> handleOrder() {
        return order.execute();
    }

}

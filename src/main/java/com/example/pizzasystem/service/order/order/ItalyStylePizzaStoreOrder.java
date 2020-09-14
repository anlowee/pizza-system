package com.example.pizzasystem.service.order.order;

import com.example.pizzasystem.service.order.BaseOrder;
import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.store.ItalyStylePizzaStore;

import java.util.List;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public class ItalyStylePizzaStoreOrder extends Order {

    public ItalyStylePizzaStoreOrder(List<BaseOrder> baseOrders) {
        this.pizzaStore = new ItalyStylePizzaStore();
        this.baseOrders = baseOrders;
    }

    @Override
    public List<Pizza> execute() {
        return makePizzas();
    }
}

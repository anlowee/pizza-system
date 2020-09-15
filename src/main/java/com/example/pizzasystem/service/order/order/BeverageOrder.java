package com.example.pizzasystem.service.order.order;

import com.example.pizzasystem.service.beverage.adapter.BeveragePizzaAdapter;
import com.example.pizzasystem.service.beverage.base.Beverage;
import com.example.pizzasystem.service.beverage.factory.BeverageFactory;
import com.example.pizzasystem.service.order.BaseOrder;
import com.example.pizzasystem.service.pizza.base.Pizza;
import org.springframework.beans.factory.BeanFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 */
public class BeverageOrder extends Order {

    private BeverageFactory beverageFactory;

    public BeverageOrder(List<BaseOrder> baseOrders) {
        this.baseOrders = baseOrders;
        beverageFactory = new BeverageFactory();
    }

    @Override
    public List<Pizza> execute() {
        List<Pizza> beverages = new ArrayList<>();
        for (BaseOrder baseOrder : baseOrders) {
            BeveragePizzaAdapter beverage = new BeveragePizzaAdapter(beverageFactory.createBeverage(baseOrder));
            beverages.add(beverage);
        }
        return beverages;
    }
}

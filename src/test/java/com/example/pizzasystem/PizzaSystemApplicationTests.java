package com.example.pizzasystem;

import com.example.pizzasystem.service.beverage.base.Beverage;
import com.example.pizzasystem.service.beverage.factory.BeverageFactory;
import com.example.pizzasystem.service.order.OrderHandler;
import com.example.pizzasystem.service.order.BaseOrder;
import com.example.pizzasystem.service.order.order.ItalyStylePizzaStoreOrder;
import com.example.pizzasystem.service.order.order.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class PizzaSystemApplicationTests {

    @Test
    void contextLoads() {
        BaseOrder baseOrder = new BaseOrder();
        baseOrder.setType("Pepperoni");
        ArrayList<String> additions = new ArrayList<>();
        additions.add("Large Size");
        additions.add("More Cheese");
        additions.add("More Cheese");
        additions.add("More Pepperoni");
        additions.add("High Temperature");
        additions.add("Long Time");
        additions.add("10 Slices");
        additions.add("Dine");
        baseOrder.setAdditions(additions);

        List<BaseOrder> baseOrders = new ArrayList<>();
        baseOrders.add(baseOrder);
        baseOrders.add(baseOrder);

        Order order = new ItalyStylePizzaStoreOrder(baseOrders);
        OrderHandler orderHandler = new OrderHandler();
        orderHandler.setOrder(order);
        orderHandler.handleOrder();

        BaseOrder baseOrder1 = new BaseOrder();
        baseOrder1.setType("Milk Tea");
        ArrayList<String> additions1 = new ArrayList<>();
        additions1.add("Milk");
        additions1.add("Mocha");
        additions1.add("Soy");
        additions1.add("Whip");
        baseOrder1.setAdditions(additions1);
        BeverageFactory beverageFactory = new BeverageFactory();
        Beverage beverage = beverageFactory.createBeverage(baseOrder1);
        beverage.description();
    }

}

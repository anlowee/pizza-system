package com.example.pizzasystem.control;

import com.example.pizzasystem.service.order.BaseOrder;
import com.example.pizzasystem.service.order.OrderHandler;
import com.example.pizzasystem.service.order.order.AmericaStylePizzaStoreOrder;
import com.example.pizzasystem.service.order.order.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 */
@RestController
public class PizzaOrderController {

    @GetMapping("/api/america/pizza")
    public String orderPizzasAtAmericaStyleStore(
            @RequestBody List<BaseOrder> pizzaOrders ) {
        Order order = new AmericaStylePizzaStoreOrder(pizzaOrders);
        OrderHandler orderHandler = new OrderHandler();
        orderHandler.setPizzaOrder(order);
        return orderHandler.handleOrder();
    }

}

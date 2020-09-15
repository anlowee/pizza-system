package com.example.pizzasystem.control;

import com.example.pizzasystem.service.order.BaseOrder;
import com.example.pizzasystem.service.order.OrderHandler;
import com.example.pizzasystem.service.order.order.AmericaStylePizzaStoreOrder;
import com.example.pizzasystem.service.order.order.BeverageOrder;
import com.example.pizzasystem.service.order.order.ItalyStylePizzaStoreOrder;
import com.example.pizzasystem.service.order.order.Order;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 */
@RestController
public class PizzaOrderController {

    @GetMapping("/api/america/order")
    public String orderPizzasAtAmericaStyleStore(
            @RequestBody RequestBean requestBean) {
        Order pizzaOrdersIssue = new AmericaStylePizzaStoreOrder(requestBean.getPizzas());
        Order beverageOrdersIssue = new BeverageOrder(requestBean.getBeverages());
        OrderHandler orderHandler = new OrderHandler();
        orderHandler.setPizzaOrder(pizzaOrdersIssue);
        orderHandler.setBeverageOrder(beverageOrdersIssue);
        return orderHandler.handleOrder();
    }

    @GetMapping("/api/italy/order")
    public String orderPizzasAtItalyStyleStore(
           @RequestBody RequestBean requestBean
    ) {
        Order pizzaOrdersIssue = new ItalyStylePizzaStoreOrder(requestBean.getPizzas());
        Order beverageOrdersIssue = new BeverageOrder(requestBean.getBeverages());
        OrderHandler orderHandler = new OrderHandler();
        orderHandler.setPizzaOrder(pizzaOrdersIssue);
        orderHandler.setBeverageOrder(beverageOrdersIssue);
        return orderHandler.handleOrder();
    }

}

@Data
class RequestBean {
    private List<BaseOrder> pizzas;
    private List<BaseOrder> beverages;
}

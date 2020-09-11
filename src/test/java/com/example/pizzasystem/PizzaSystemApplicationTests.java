package com.example.pizzasystem;

import com.example.pizzasystem.service.pizza.component.Pizza;
import com.example.pizzasystem.service.pizza.order.PizzaOrder;
import com.example.pizzasystem.service.pizza.store.AmericaStylePizzaStore;
import com.example.pizzasystem.service.pizza.store.PizzaStore;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PizzaSystemApplicationTests {

    @Test
    void contextLoads() {
        PizzaStore pizzaStore = new AmericaStylePizzaStore();
        PizzaOrder pizzaOrder = new PizzaOrder();
        pizzaOrder.setType("Cheese");
        Pizza pizza = pizzaStore.orderPizza(pizzaOrder);
        pizza.description();
    }

}

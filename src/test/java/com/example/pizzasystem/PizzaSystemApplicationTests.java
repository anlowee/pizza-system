package com.example.pizzasystem;

import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.pizza.order.PizzaOrder;
import com.example.pizzasystem.service.pizza.store.AmericaStylePizzaStore;
import com.example.pizzasystem.service.pizza.store.PizzaStore;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class PizzaSystemApplicationTests {

    @Test
    void contextLoads() {
        PizzaStore pizzaStore = new AmericaStylePizzaStore();
        PizzaOrder pizzaOrder = new PizzaOrder();
        pizzaOrder.setType("Cheese");
        ArrayList<String> additions = new ArrayList<>();
        additions.add("Large Size");
        additions.add("More Cheese");
        additions.add("More Cheese");
        additions.add("More Cheese");
        additions.add("High Temperature");
        additions.add("Long Time");
        additions.add("10 Slices");
        additions.add("Dine");
        pizzaOrder.setAdditions(additions);
        Pizza pizza = pizzaStore.orderPizza(pizzaOrder);
        pizza.description();
    }

}

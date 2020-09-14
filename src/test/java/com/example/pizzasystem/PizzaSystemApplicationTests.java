package com.example.pizzasystem;

import com.example.pizzasystem.service.pizza.component.Pizza;
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
        ArrayList<String> additions = new ArrayList<>();
        additions.add("High Temperature");
        additions.add("Long Time");
        additions.add("10 Slices");
        additions.add("Dine");
        pizzaOrder.setAdditions(additions);
        Pizza pizza = pizzaStore.createPizza(pizzaOrder);
        pizza.description();
        System.out.println(pizza.getDough().prepare());
    }

}

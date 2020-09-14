package com.example.pizzasystem.service.store;

import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.pizza.decorator.bake.HighTemperature;
import com.example.pizzasystem.service.pizza.decorator.bake.LongTime;
import com.example.pizzasystem.service.pizza.decorator.box.Dine;
import com.example.pizzasystem.service.pizza.decorator.box.TakeOut;
import com.example.pizzasystem.service.pizza.decorator.cut.TenSlices;
import com.example.pizzasystem.service.pizza.decorator.cut.TwelveSlices;
import com.example.pizzasystem.service.pizza.decorator.prepare.LargeSize;
import com.example.pizzasystem.service.pizza.decorator.prepare.MoreCheese;
import com.example.pizzasystem.service.pizza.decorator.prepare.MoreSauce;
import com.example.pizzasystem.service.pizza.decorator.prepare.MoreToppings;
import com.example.pizzasystem.service.pizza.order.PizzaOrder;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/11
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/11
 */
public abstract class PizzaStore {

    public Pizza orderPizza(PizzaOrder pizzaOrder) {
        // first step is to choose a base-type of pizza in america-style
        Pizza pizza = createPizza(pizzaOrder);
        return pizza;
    }

    /**
     * factory method
     * @param pizzaOrder base pizza type
     * @return a pizzal
     */
    abstract Pizza createPizza(PizzaOrder pizzaOrder);

}

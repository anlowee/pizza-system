package com.example.pizzasystem.service.pizza.store;

import com.example.pizzasystem.service.pizza.base.PepperoniPizza;
import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.pizza.base.CheesePizza;
import com.example.pizzasystem.service.pizza.decorator.bake.HighTemperature;
import com.example.pizzasystem.service.pizza.decorator.bake.LongTime;
import com.example.pizzasystem.service.pizza.decorator.box.Dine;
import com.example.pizzasystem.service.pizza.decorator.box.TakeOut;
import com.example.pizzasystem.service.pizza.decorator.cut.TenSlices;
import com.example.pizzasystem.service.pizza.decorator.cut.TwelveSlices;
import com.example.pizzasystem.service.pizza.ingredient.factory.AmericaStylePizzaIngredientFactory;
import com.example.pizzasystem.service.pizza.order.PizzaOrder;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/11
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/11
 */
public class AmericaStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "Cheese":
                pizza = new CheesePizza(new AmericaStylePizzaIngredientFactory());
                break;
            case "Pepperoni":
                pizza = new PepperoniPizza(new AmericaStylePizzaIngredientFactory());
                break;
            default:
                break;
        }
        return pizza;
    }
}

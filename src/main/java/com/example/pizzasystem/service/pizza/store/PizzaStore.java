package com.example.pizzasystem.service.pizza.store;

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
        Pizza pizza = createPizza(pizzaOrder.getType());
        for (String addition : pizzaOrder.getAdditions()) {
            switch (addition) {
                // second step is to set prepare method
                case "Large Size":
                    pizza = new LargeSize(pizza);
                    break;
                case "More Cheese":
                    pizza = new MoreCheese(pizza);
                    break;
                case "More Sauce":
                    pizza = new MoreSauce(pizza);
                    break;
                case "More Toppings":
                    pizza = new MoreToppings(pizza);
                    break;
                // third step is to set bake method
                case "High Temperature":
                    pizza = new HighTemperature(pizza);
                    break;
                case "Long Time":
                    pizza = new LongTime(pizza);
                    break;
                // forth step is to set cut method
                case "10 Slices":
                    pizza = new TenSlices(pizza);
                    break;
                case "12 Slices":
                    pizza = new TwelveSlices(pizza);
                    break;
                // the last step is to set box method
                case "Dine":
                    pizza = new Dine(pizza);
                    break;
                case "Take Out":
                    pizza = new TakeOut(pizza);
                    break;
                default:
                    break;
            }
        }
        return pizza;
    }

    /**
     * factory method
     * @param type base pizza type
     * @return a pizzal
     */
    abstract Pizza createPizza(String type);

}

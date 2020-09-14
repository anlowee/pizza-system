package com.example.pizzasystem.service.pizza.store;

import com.example.pizzasystem.service.pizza.component.Pizza;
import com.example.pizzasystem.service.pizza.component.concretecomponent.america.AmericaStylePizza;
import com.example.pizzasystem.service.pizza.component.decorator.concrettedecorator.bake.HighTemperature;
import com.example.pizzasystem.service.pizza.component.decorator.concrettedecorator.bake.LongTime;
import com.example.pizzasystem.service.pizza.component.decorator.concrettedecorator.box.Dine;
import com.example.pizzasystem.service.pizza.component.decorator.concrettedecorator.box.TakeOut;
import com.example.pizzasystem.service.pizza.component.decorator.concrettedecorator.cut.TenSlices;
import com.example.pizzasystem.service.pizza.component.decorator.concrettedecorator.cut.TwelveSlices;
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
public class AmericaStylePizzaStore implements PizzaStore {
    @Override
    public Pizza createPizza(PizzaOrder pizzaOrder) {
        Pizza pizza = new AmericaStylePizza(new AmericaStylePizzaIngredientFactory());
        for (String addition : pizzaOrder.getAdditions()) {
            switch (addition) {
                // first step is to choose a base-type of pizza in america-style
                // TODO
                // second step is to set prepare method
                // TODO
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
}

package com.example.pizzasystem.service.store;

import com.example.pizzasystem.service.pizza.base.CheesePizza;
import com.example.pizzasystem.service.pizza.base.PepperoniPizza;
import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.pizza.decorator.bake.HighTemperature;
import com.example.pizzasystem.service.pizza.decorator.bake.LongTime;
import com.example.pizzasystem.service.pizza.decorator.box.Dine;
import com.example.pizzasystem.service.pizza.decorator.box.TakeOut;
import com.example.pizzasystem.service.pizza.decorator.cut.TenSlices;
import com.example.pizzasystem.service.pizza.decorator.cut.TwelveSlices;
import com.example.pizzasystem.service.pizza.decorator.prepare.*;
import com.example.pizzasystem.service.pizza.ingredient.factory.ItalyStylePizzaIngredientFactory;
import com.example.pizzasystem.service.order.BaseOrder;
import com.example.pizzasystem.service.pizza.ingredient.factory.PizzaIngredientFactory;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public class ItalyStylePizzaStore extends PizzaStore {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ItalyStylePizzaStore(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    Pizza createPizza(BaseOrder baseOrder) {
        Pizza pizza = null;
        switch (baseOrder.getType()) {
            case "Cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                break;
            case "Pepperoni":
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                break;
            default:
                break;
        }
        assert pizza != null;
        for (String addition : baseOrder.getAdditions()) {
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
                // italy style special offer
                case "More Pepperoni":
                    pizza = new MorePepperoni(pizza);
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
}

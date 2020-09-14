package com.example.pizzasystem.service.pizza.ingredient.factory;

import com.example.pizzasystem.service.pizza.ingredient.cheese.Cheese;
import com.example.pizzasystem.service.pizza.ingredient.cheese.ReggianoCheese;
import com.example.pizzasystem.service.pizza.ingredient.dough.Dough;
import com.example.pizzasystem.service.pizza.ingredient.dough.ThinCrustDough;
import com.example.pizzasystem.service.pizza.ingredient.sauce.MarinaraSauce;
import com.example.pizzasystem.service.pizza.ingredient.sauce.Sauce;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public class AmericaStylePizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}

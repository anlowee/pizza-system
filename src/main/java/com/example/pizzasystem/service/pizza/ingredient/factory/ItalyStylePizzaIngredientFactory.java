package com.example.pizzasystem.service.pizza.ingredient.factory;

import com.example.pizzasystem.service.pizza.ingredient.cheese.Cheese;
import com.example.pizzasystem.service.pizza.ingredient.cheese.MozzarellaCheese;
import com.example.pizzasystem.service.pizza.ingredient.dough.Dough;
import com.example.pizzasystem.service.pizza.ingredient.dough.ThickCrustDough;
import com.example.pizzasystem.service.pizza.ingredient.sauce.PlumTomatoSauce;
import com.example.pizzasystem.service.pizza.ingredient.sauce.Sauce;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public class ItalyStylePizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}

package com.example.pizzasystem.service.pizza.base;

import com.example.pizzasystem.service.pizza.ingredient.factory.PizzaIngredientFactory;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/13
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/13
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "cheese pizza";
        dough = pizzaIngredientFactory.createDough();
        sauce = "marinara sauce";
    }

    @Override
    public String prepare() {
        return "preparing a cheese pizza";
    }

    @Override
    public String bake() {
        return "baking a cheese pizza";
    }

    @Override
    public String cut() {
        return "cutting a cheese pizza";
    }

    @Override
    public String box() {
        return "boxing a cheese pizza";
    }
}

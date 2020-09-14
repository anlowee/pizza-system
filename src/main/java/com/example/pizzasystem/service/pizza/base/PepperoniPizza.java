package com.example.pizzasystem.service.pizza.base;

import com.example.pizzasystem.service.pizza.ingredient.factory.PizzaIngredientFactory;
import lombok.Setter;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public class PepperoniPizza extends Pizza {

    @Setter
    PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        name = "pepperoni pizza";
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
        sauce = pizzaIngredientFactory.createSauce();
    }

    @Override
    public String prepare() {
        return "preparing a pepperoni pizza";
    }

    @Override
    public String bake() {
        return "baking a pepperoni pizza";
    }

    @Override
    public String cut() {
        return "cutting a pepperoni pizza";
    }

    @Override
    public String box() {
        return "boxing a pepperoni pizza";
    }
}

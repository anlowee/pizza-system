package com.example.pizzasystem.service.pizza.base;

import com.example.pizzasystem.service.pizza.ingredient.factory.PizzaIngredientFactory;
import com.example.pizzasystem.service.menu.Menu;
import lombok.Setter;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/13
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/13
 */
public class CheesePizza extends Pizza {

    @Setter
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        name = "cheese pizza";
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
        sauce = pizzaIngredientFactory.createSauce();
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

    @Override
    public Double cost() {
        return Menu.getInstance().getCheesePizzaPrice();
    }
}

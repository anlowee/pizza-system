package com.example.pizzasystem.service.pizza.decorator.prepare;

import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.menu.Menu;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public class MoreToppings extends Pizza {

    Pizza pizza;

    public MoreToppings(Pizza pizza) {
        this.pizza = pizza;
        this.name = pizza.getName();
        this.dough = pizza.getDough();
        this.cheese = pizza.getCheese();
        this.sauce = pizza.getSauce();
    }

    @Override
    public String prepare() {
        return pizza.prepare() + ", more toppings";
    }

    @Override
    public String bake() {
        return pizza.bake();
    }

    @Override
    public String cut() {
        return pizza.cut();
    }

    @Override
    public String box() {
        return pizza.box();
    }

    @Override
    public Double cost() {
        return pizza.cost() + Menu.getInstance().getMoreToppingsPrice();
    }
}

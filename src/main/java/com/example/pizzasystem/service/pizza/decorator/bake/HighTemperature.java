package com.example.pizzasystem.service.pizza.decorator.bake;

import com.example.pizzasystem.service.pizza.base.Pizza;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/13
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/13
 */
public class HighTemperature extends Pizza {

    Pizza pizza;

    public HighTemperature(Pizza pizza) {
        this.pizza = pizza;
        this.name = pizza.getName();
        this.dough = pizza.getDough();
        this.cheese = pizza.getCheese();
        this.sauce = pizza.getSauce();
    }

    @Override
    public String prepare() {
        return pizza.prepare();
    }

    @Override
    public String bake() {
        return pizza.bake() + ", bake at 500C";
    }

    @Override
    public String cut() {
        return pizza.cut();
    }

    @Override
    public String box() {
        return pizza.box();
    }

}

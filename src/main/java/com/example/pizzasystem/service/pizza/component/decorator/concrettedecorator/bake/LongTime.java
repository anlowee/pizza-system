package com.example.pizzasystem.service.pizza.component.decorator.concrettedecorator.bake;

import com.example.pizzasystem.service.pizza.component.Pizza;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/13
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/13
 */
public class LongTime extends Pizza {

    Pizza pizza;

    public LongTime(Pizza pizza) {
        this.pizza = pizza;
        this.name = pizza.getName();
        this.dough = pizza.getDough();
        this.sauce = pizza.getSauce();
        this.toppings = pizza.getToppings();
    }

    @Override
    public String prepare() {
        return pizza.prepare();
    }

    @Override
    public String bake() {
        return pizza.bake() + ", bake for 45 minutes";
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

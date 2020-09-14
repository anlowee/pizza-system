package com.example.pizzasystem.service.pizza.decorator.cut;

import com.example.pizzasystem.service.pizza.base.Pizza;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/13
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/13
 */
public class TwelveSlices extends Pizza {

    Pizza pizza;

    public TwelveSlices(Pizza pizza) {
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
        return pizza.bake();
    }

    @Override
    public String cut() {
        return pizza.cut() + ", cut to 12 slices";
    }

    @Override
    public String box() {
        return pizza.box();
    }
}

package com.example.pizzasystem.service.pizza.component.concretecomponent.america;

import com.example.pizzasystem.service.pizza.component.Pizza;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/13
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/13
 */
public class AmericaStylePizza extends Pizza {

    public AmericaStylePizza() {
        name = "america-style pizza";
        dough = "thin crust dough";
        sauce = "marinara sauce";
    }

    @Override
    public String prepare() {
        return "preparing a america-style pizza";
    }

    @Override
    public String bake() {
        return "baking a america-style pizza";
    }

    @Override
    public String cut() {
        return "cutting a america-style pizza";
    }

    @Override
    public String box() {
        return "boxing a america-style pizza";
    }
}

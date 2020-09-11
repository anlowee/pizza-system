package com.example.pizzasystem.service.pizza.component.concretecomponent.america;

import com.example.pizzasystem.service.pizza.component.Pizza;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/11
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/11
 */
public class AmericaStyleCheesePizza extends Pizza {

    public AmericaStyleCheesePizza() {
        name = "america-style cheese pizza";
        dough = "thin crust dough";
        sauce = "marinara sauce";
    }

    @Override
    public void prepare() {
        System.out.println("preparing a america-style cheese pizza...");
    }

    @Override
    public void bake() {
        System.out.println("baking a america-style cheese pizza...");
    }

    @Override
    public void cut() {
        System.out.println("cutting a america-style cheese pizza...");
    }

    @Override
    public void box() {
        System.out.println("boxing a america-style cheese pizza...");
    }
}

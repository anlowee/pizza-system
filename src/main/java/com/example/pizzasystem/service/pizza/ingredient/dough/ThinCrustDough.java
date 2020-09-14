package com.example.pizzasystem.service.pizza.ingredient.dough;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public class ThinCrustDough implements Dough {
    @Override
    public String prepare() {
        return "use thin crust dough";
    }
}

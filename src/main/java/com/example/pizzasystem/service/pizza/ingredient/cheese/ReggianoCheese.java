package com.example.pizzasystem.service.pizza.ingredient.cheese;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public class ReggianoCheese implements Cheese {
    @Override
    public String prepare() {
        // use in us style store
        return "use reggiano cheese";
    }
}

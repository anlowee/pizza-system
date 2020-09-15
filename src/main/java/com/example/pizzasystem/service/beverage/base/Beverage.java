package com.example.pizzasystem.service.beverage.base;

import lombok.Getter;
import lombok.Setter;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public abstract class Beverage {

    @Setter@Getter
    protected String name;

    public Beverage() {
        name = "an undefined beverage";
    }

    public String description() {
        String description = name + "\n"
                + prepare() + "\n"
                + String.format("cost: %.2f\n", cost());
        return description;
    }

    public abstract String prepare();
    public abstract Double cost();

}

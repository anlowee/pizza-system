package com.example.pizzasystem.service.pizza.base;

import com.example.pizzasystem.service.pizza.ingredient.cheese.Cheese;
import com.example.pizzasystem.service.pizza.ingredient.dough.Dough;
import com.example.pizzasystem.service.pizza.ingredient.sauce.Sauce;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/11
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/11
 */
public abstract class Pizza {

    @Setter@Getter
    protected String name;
    @Setter@Getter
    protected Dough dough;
    @Setter@Getter
    protected Cheese cheese;
    @Setter@Getter
    protected Sauce sauce;

    public Pizza() {
        name = "a undefined pizza";
    }

    public String description() {
        String description = name + "\n"
                + dough.prepare() + "\n"
                + cheese.prepare() + "\n"
                + sauce.prepare() + "\n"
                + prepare() + "\n"
                + bake() + "\n"
                + cut() + "\n"
                + box() + "\n"
                + String.format("cost: %.2f\n", cost());
        return description;
    }

    public abstract String prepare();
    public abstract String bake();
    public abstract String cut();
    public abstract String box();
    public abstract Double cost();

}

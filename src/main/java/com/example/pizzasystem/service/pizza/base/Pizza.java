package com.example.pizzasystem.service.pizza.base;

import com.example.pizzasystem.service.pizza.ingredient.dough.Dough;
import com.example.pizzasystem.service.pizza.topping.Topping;
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
    protected String sauce;
    @Setter@Getter
    protected ArrayList<Topping> toppings = new ArrayList<>();

    public Pizza() {
        name = "a undefined pizza";
        sauce = "a undefined sauce";
    }

    public void description() {
        // TODO add toppings' description
        System.out.println(name + "\n"
                + dough + "\n"
                + sauce
        );
        System.out.println(prepare());
        System.out.println(bake());
        System.out.println(cut());
        System.out.println(box());
    }

    public abstract String prepare();
    public abstract String bake();
    public abstract String cut();
    public abstract String box();

}

package com.example.pizzasystem.service.pizza.component;

import com.example.pizzasystem.service.pizza.topping.Topping;
import lombok.Data;

import java.util.ArrayList;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/11
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/11
 */
@Data
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<Topping> toppings = new ArrayList<>();

    public void description() {
        // TODO add toppings' description
        System.out.println(name + "\n" + dough + "\n" + sauce);
    }
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

}

package com.example.pizzasystem.service.pizza.decorator.box;

import com.example.pizzasystem.service.pizza.base.Pizza;
import com.example.pizzasystem.service.menu.Menu;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/13
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/13
 */
public class TakeOut extends Pizza {

    Pizza pizza;

    public TakeOut(Pizza pizza) {
        this.pizza = pizza;
        this.name = pizza.getName();
        this.dough = pizza.getDough();
        this.cheese = pizza.getCheese();
        this.sauce = pizza.getSauce();
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
        return pizza.cut();
    }

    @Override
    public String box() {
        return pizza.box() + ", take out with box";
    }

    @Override
    public Double cost() {
        return pizza.cost() + Menu.getInstance().getBoxPrice();
    }
}

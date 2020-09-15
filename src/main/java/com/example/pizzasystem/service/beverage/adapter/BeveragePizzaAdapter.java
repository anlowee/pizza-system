package com.example.pizzasystem.service.beverage.adapter;

import com.example.pizzasystem.service.beverage.base.Beverage;
import com.example.pizzasystem.service.pizza.base.Pizza;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 */
public class BeveragePizzaAdapter extends Pizza {

    Beverage beverage;

    public BeveragePizzaAdapter(Beverage beverage) {
        this.beverage = beverage;
        name = beverage.getName();
    }

    @Override
    public void description() {
        beverage.description();
    }

    @Override
    public String prepare() {
        return null;
    }

    @Override
    public String bake() {
        return null;
    }

    @Override
    public String cut() {
        return null;
    }

    @Override
    public String box() {
        return null;
    }

    @Override
    public Double cost() {
        return beverage.cost();
    }
}

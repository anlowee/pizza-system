package com.example.pizzasystem.service.beverage.decorator;

import com.example.pizzasystem.service.beverage.base.Beverage;
import com.example.pizzasystem.service.menu.Menu;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public class Whip extends Beverage {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        name = beverage.getName();
    }

    @Override
    public String prepare() {
        return beverage.prepare() + ", add whip";
    }

    @Override
    public Double cost() {
        return beverage.cost() + Menu.getInstance().getAdditionalWhipPrice();
    }
}

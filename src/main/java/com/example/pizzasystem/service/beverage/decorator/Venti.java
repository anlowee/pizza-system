package com.example.pizzasystem.service.beverage.decorator;

import com.example.pizzasystem.service.beverage.base.Beverage;
import com.example.pizzasystem.service.menu.Menu;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 */
public class Venti extends Beverage {

    Beverage beverage;

    public Venti(Beverage beverage) {
        this.beverage = beverage;
        name = beverage.getName();
    }

    @Override
    public String prepare() {
        return beverage.prepare() + ", venti size";
    }

    @Override
    public Double cost() {
        return beverage.cost() + Menu.getInstance().getVentiSizePrice();
    }
}

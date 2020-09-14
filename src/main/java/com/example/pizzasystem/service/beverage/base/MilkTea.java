package com.example.pizzasystem.service.beverage.base;

import com.example.pizzasystem.service.menu.Menu;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public class MilkTea extends Beverage {

    public MilkTea() {
        name = "milk tea";
    }

    @Override
    public String prepare() {
        return "preparing a milk tea";
    }

    @Override
    public Double cost() {
        return Menu.getInstance().getMilkTeaPrice();
    }
}

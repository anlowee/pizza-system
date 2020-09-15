package com.example.pizzasystem.service.beverage.factory;

import com.example.pizzasystem.service.beverage.base.Beverage;
import com.example.pizzasystem.service.beverage.base.Coffee;
import com.example.pizzasystem.service.beverage.base.MilkTea;
import com.example.pizzasystem.service.beverage.decorator.*;
import com.example.pizzasystem.service.order.BaseOrder;

import java.util.List;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public class BeverageFactory {

    public Beverage createBeverage(BaseOrder baseOrder) {
        Beverage beverage = null;
        switch (baseOrder.getType()) {
            case "Coffee":
                beverage = new Coffee();
                break;
            case "Milk Tea":
                beverage = new MilkTea();
                break;
            default:
                break;
        }
        assert beverage != null;
        for (String addition : baseOrder.getAdditions()) {
            switch (addition) {
                case "Milk":
                    beverage = new Milk(beverage);
                    break;
                case "Mocha":
                    beverage = new Mocha(beverage);
                    break;
                case "Soy":
                    beverage = new Soy(beverage);
                    break;
                case "Whip":
                    beverage = new Whip(beverage);
                    break;
                case "Tall Size":
                    beverage = new Tall(beverage);
                    break;
                case "Venti Size":
                    beverage = new Venti(beverage);
                    break;
                default:
                    break;
            }
        }
        return beverage;
    }

}

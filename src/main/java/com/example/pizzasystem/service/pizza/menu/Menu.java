package com.example.pizzasystem.service.pizza.menu;

import lombok.Getter;
import lombok.Setter;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/14
 * @introduction a singleton class
 * @last-check-in anlowee
 * @date 2020/9/14
 */
public class Menu {
    private volatile static Menu uniqueInstance;

    @Setter@Getter
    private Double cheesePizzaPrice;
    @Setter@Getter
    private Double pepperoniPizzaPrice;
    @Setter@Getter
    private Double boxPrice;  // when take-out, box cost
    @Setter@Getter
    private Double largeSizePrice;
    @Setter@Getter
    private Double moreCheesePrice;
    @Setter@Getter
    private Double moreSaucePrice;
    @Setter@Getter
    private Double moreToppingsPrice;

    private Menu() {
        cheesePizzaPrice = 6.99;
        pepperoniPizzaPrice = 7.99;
        boxPrice = 0.19;
        largeSizePrice = 0.99;
        moreCheesePrice = 1.99;
        moreSaucePrice = 0.99;
        moreToppingsPrice = 2.99;
    }

    public static Menu getInstance() {
        if (uniqueInstance == null) {
            synchronized (Menu.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Menu();
                }
            }
        }
        return uniqueInstance;
    }
}

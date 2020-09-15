package com.example.pizzasystem.service.menu;

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

    // pizza price
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
    @Setter@Getter
    private Double morePepperoniPrice;

    // beverage price
    @Setter@Getter
    private Double coffeePrice;
    @Setter@Getter
    private Double milkTeaPrice;
    @Setter@Getter
    private Double additionalMilkPrice;
    @Setter@Getter
    private Double additionalMochaPrice;
    @Setter@Getter
    private Double additionalSoyPrice;
    @Setter@Getter
    private Double additionalWhipPrice;
    @Setter@Getter
    private Double tallSizePrice;
    @Setter@Getter
    private Double ventiSizePrice;

    private Menu() {
        cheesePizzaPrice = 6.99;
        pepperoniPizzaPrice = 7.99;
        boxPrice = 0.19;
        largeSizePrice = 0.99;
        moreCheesePrice = 1.99;
        moreSaucePrice = 0.99;
        moreToppingsPrice = 2.99;
        morePepperoniPrice = 1.99;

        coffeePrice = 0.99;
        milkTeaPrice = 1.99;
        additionalMilkPrice = 0.99;
        additionalMochaPrice = 1.29;
        additionalSoyPrice = 0.59;
        additionalWhipPrice = 0.99;
        tallSizePrice = 0.59;
        ventiSizePrice = 0.99;
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

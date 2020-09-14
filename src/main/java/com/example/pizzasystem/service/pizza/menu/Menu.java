package com.example.pizzasystem.service.pizza.menu;

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

    private Menu() {

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

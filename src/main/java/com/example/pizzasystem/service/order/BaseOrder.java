package com.example.pizzasystem.service.order;

import lombok.Data;

import java.util.ArrayList;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/11
 * @introduction A pizza order, pass to store to make pizza
 * @last-check-in anlowee
 * @date 2020/9/11
 */
@Data
public class BaseOrder {

    private String type;
    private ArrayList<String> additions;

}

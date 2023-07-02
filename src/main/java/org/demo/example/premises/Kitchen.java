package org.demo.example.premises;

import org.demo.example.orders.*;
import org.demo.example.personel.Cook;

import java.util.ArrayList;
import java.util.Map;

public class Kitchen {
    private final ArrayList<Cook> cooksList = new ArrayList<>();

    public Kitchen() {
        Cook cook = new Cook("Alice", "Peterson");
        cooksList.add(cook);
    }

    public void makeDish(Order order){
        Map<Dish, Integer> orderedDishes = order.getOrderedDishes();
        Cook cook = cooksList.get(0);

        if (orderedDishes.size() == 0){
            System.out.println("В замовленні страви відсутні");
        } else {
            for (Dish orderedDish : orderedDishes.keySet()) {
                cook.makeDish(orderedDish);
                orderedDish.getComponents();
            }
        }

    }
}

package org.demo.example.premises;

import org.demo.example.orders.*;
import org.demo.example.personel.Barman;

import java.util.ArrayList;
import java.util.Map;

public class Bar {
    private ArrayList<Barman> barmenList;

    public Bar() {
        Barman barman = new Barman("Peter", "Petty");
        barmenList.add(barman);
    }

    public void makeDrink(Order order){
        Map<Drink, Integer> orderedDrinks = order.getOrderedDrinks();
        Barman barman = barmenList.get(0);

        if (orderedDrinks.size() == 0){
            System.out.println("В замовленні напої відсутні");
        } else {
            for (Drink orderedDrink : orderedDrinks.keySet()) {
                barman.makeDrink(orderedDrink);
                orderedDrink.getComponents();
            }
        }
    }
}

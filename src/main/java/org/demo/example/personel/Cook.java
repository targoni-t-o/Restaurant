package org.demo.example.personel;

import org.demo.example.orders.Dish;

public class Cook extends Employee{

    public Cook(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void makeDish(Dish dish){
        System.out.println("Повар " + this.getFulName() + " робить страву " + dish.name);
    }
}

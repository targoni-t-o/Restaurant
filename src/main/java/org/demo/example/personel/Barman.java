package org.demo.example.personel;

import org.demo.example.orders.Drink;

public class Barman extends Employee{

    public Barman(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void makeDrink(Drink drink){
        System.out.println("Бармен " + this.getFulName() + " робить напой " + drink.name);
    }
}

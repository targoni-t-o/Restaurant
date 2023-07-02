package org.demo.example.orders;

public class Drink {
    public String name;
    public String components;
    public int price;

    public Drink(String name, String components, int price) {
        this.name = name;
        this.components = components;
        this.price = price;
    }

    public void getComponents() {
        System.out.println("Напой " + this.name + " робиться з " + this.components);
    }

}

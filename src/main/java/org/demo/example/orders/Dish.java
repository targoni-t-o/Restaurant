package org.demo.example.orders;

public class Dish {
    public String name;
    public String components;
    public int price;

    public Dish(String name, String components, int price) {
        this.name = name;
        this.components = components;
        this.price = price;
    }

    public void getComponents() {
        System.out.println("Страва " + this.name + " робиться з " + this.components);
    }
}

package org.demo.example.orders;

import java.util.Map;

public class Order {
    private Map<Dish, Integer> orderedDishes;
    private Map<Drink, Integer> orderedDrinks;

    public Order(){
        OrderService.orderDishes(this);
        OrderService.orderDrinks(this);
    }

    public void setOrderedDish(Dish dish, int quantity) {
        this.orderedDishes.put(dish, quantity);
    }

    public void setOrderedDrink(Drink drink, int quantity) {
        this.orderedDrinks.put(drink, quantity);
    }

    public Map<Dish, Integer> getOrderedDishes() {
        return orderedDishes;
    }

    public Map<Drink, Integer> getOrderedDrinks() {
        return orderedDrinks;
    }
}

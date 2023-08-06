package resturant.orders;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private final Map<Dish, Integer> orderedDishes = new HashMap<>();
    private final Map<Drink, Integer> orderedDrinks = new HashMap<>();

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

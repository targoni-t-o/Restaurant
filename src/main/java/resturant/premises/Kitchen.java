package resturant.premises;

import resturant.personel.Cook;
import resturant.orders.Dish;
import resturant.orders.Order;

import java.util.*;

public class Kitchen {
    private List<Cook> cooksList;

    public Kitchen(List<Cook> cooksList) {
        this.cooksList = cooksList;
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

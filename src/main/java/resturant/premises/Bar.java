package resturant.premises;

import resturant.orders.Drink;
import resturant.orders.Order;
import resturant.personel.Barman;

import java.util.*;

public class Bar {
    private List<Barman> barmenList;

    public Bar() {
        barmenList = new ArrayList<>();
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

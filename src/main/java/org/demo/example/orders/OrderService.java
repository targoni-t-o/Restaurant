package org.demo.example.orders;

import java.util.Map;
import java.util.Scanner;

public class OrderService {
    public static void orderDishes(Order order){
        boolean dishesOrdered = false;
        int dishesQuantity;

        System.out.println();
        System.out.println("Бажаєте замовити їжу? y/n");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        while (!dishesOrdered) {
            switch (answer) {
                case "y":
                    System.out.println("Скільки страв бажаєте замовити:");
                    dishesQuantity = scanner.nextInt();

                    selectDishes(order, dishesQuantity);

                    dishesOrdered = true;
                    break;
                case "n":
                    dishesOrdered = true;
                    break;
                default:
                    System.out.println("Невірна відповіть, введить y/n");
                    answer = scanner.nextLine();
            }
        }
    }

    public static void orderDrinks(Order order){
        boolean drinksOrdered = false;
        int drinksQuantity;

        System.out.println();
        System.out.println("Бажаєте замовити напої? y/n");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        while (!drinksOrdered) {
            switch (answer) {
                case "y":
                    System.out.println("Скільки напоїв бажаєте замовити:");
                    drinksQuantity = scanner.nextInt();

                    selectDrinks(order, drinksQuantity);

                    drinksOrdered = true;
                    break;
                case "n":
                    drinksOrdered = true;
                    break;
                default:
                    System.out.println("Невірна відповіть, введить y/n");
                    answer = scanner.nextLine();
            }
        }
    }

    public static int getTotal(Order order){
        int orderTotal = 0;

       Map<Dish, Integer> orderedDishes = order.getOrderedDishes();

        for (Dish dish:orderedDishes.keySet()) {
            orderTotal += dish.price * orderedDishes.get(dish);
        }

        Map<Drink, Integer> orderedDrinks = order.getOrderedDrinks();

        for (Drink drink:orderedDrinks.keySet()) {
            orderTotal += drink.price * orderedDrinks.get(drink);
        }

        return orderTotal;
    }

    private static void selectDishes(Order order, int dishesQuantity){
        Scanner dishScanner = new Scanner(System.in);

        for (int i = 0; i < dishesQuantity; i++) {
            while (true){
                System.out.println("Введіть назву страви:");

                String dishName = dishScanner.nextLine();
                Dish orderedDish = getDishFromString(dishName);

                if (orderedDish == null){
                    System.out.println("Страва відсутня для вибору. Повторіть будбласка вибор.");
                } else {
                    Scanner quantityScanner = new Scanner(System.in);
                    System.out.println("Кількість страв:");
                    order.setOrderedDish(orderedDish, quantityScanner.nextInt());
                    break;
                }
           }
        }
    }

    private static Dish getDishFromString(String dishName){
        Map<String, Dish> dishesList = Menu.getDishesList();

        for (String dish:dishesList.keySet()){
            if (dish.equals(dishName)){
                return dishesList.get(dish);
            }
        }
        return null;
    }

    private static void selectDrinks(Order order, int drinksQuantity){
        Scanner drinkScanner = new Scanner(System.in);

        for (int i = 0; i < drinksQuantity; i++) {
            while (true){
                System.out.println("Введіть назву напою:");

                String drinkName = drinkScanner.nextLine();
                Drink orderedDrink = getDrinkFromString(drinkName);

                if (orderedDrink == null){
                    System.out.println("Напій відсутній для вибору. Повторіть будбласка вибор.");
                } else {
                    Scanner quantityScanner = new Scanner(System.in);
                    System.out.println("Кількість напоїв:");
                    order.setOrderedDrink(orderedDrink, quantityScanner.nextInt());
                    break;
                }
            }
        }
    }

    private static Drink getDrinkFromString(String drinkName){
        Map<String, Drink> drinksList = Menu.getDrinksList();

        for (String drink:drinksList.keySet()){
            if (drink.equals(drinkName)){
                return drinksList.get(drink);
            }
        }
        return null;
    }
}

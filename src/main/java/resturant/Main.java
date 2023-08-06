package resturant;

import resturant.orders.*;
import resturant.personel.Cook;
import resturant.personel.Waiter;
import resturant.premises.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Cook> cooksList = new ArrayList<>();
        cooksList.add(new Cook("Alice", "Peterson"));
        Map<String, Boolean> tablesList = new HashMap<>();

        Random random = new Random();
        int tablesCount = getRandomNumber(1, 5);

        for (int i = 1; i <= tablesCount; i++) {
            tablesList.put("Столик " + i, random.nextBoolean());
        }

        List<Waiter> waitersList = new ArrayList<>();
        waitersList.add(new Waiter("John", "Dawson"));

        System.out.println("Вітаємо у нашому ресторані!");
        System.out.println();

        Hall hall = new Hall(tablesList, waitersList);
        String table = hall.getFreeTable();

        System.out.println("Ваш столик " + table);

        Menu.createMenu();

        hall.takeOrder();

        Order order = new Order();

        Kitchen kitchen = new Kitchen(cooksList);
        kitchen.makeDish(order);

        System.out.println();

        Bar bar = new Bar();
        bar.makeDrink(order);

        System.out.println();

        System.out.println("Ваше замовлення коштує " + OrderService.getTotal(order));
   }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}
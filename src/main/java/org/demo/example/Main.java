package org.demo.example;

import org.demo.example.orders.*;
import org.demo.example.premises.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вітаємо у нашому ресторані!");
        System.out.println();

        Hall hall = new Hall();
        String table = hall.getFreeTable();

        System.out.println("Ваш столик " + table);

        Menu.createMenu();

        hall.takeOrder();

        Order order = new Order();

        Kitchen kitchen = new Kitchen();
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
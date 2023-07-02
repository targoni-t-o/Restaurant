package org.demo.example.orders;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Menu {
    private static Map<String, Dish> dishesList;
    private static Map<String, Drink> drinksList;

    public static void createMenu() {
        createDishesList();
        createDrinksList();

        System.out.println();
        System.out.println("Сьогоднішнє меню.");

        System.out.println("Страви:");
        for (String dishName:dishesList.keySet()) {
            System.out.println(dishName + " ціна: " + dishesList.get(dishName).price);
        }

        System.out.println();
        System.out.println("Напої:");
        for (String drinkName:drinksList.keySet()) {
            System.out.println(drinkName + " ціна: " + drinksList.get(drinkName).price);
        }
    }

    private static void createDishesList(){
        Dish steak = new Dish("Стейк", "м`яса яловичини. Можливі різні рівні обжарки.", 40);
        Dish chickenWings = new Dish("Курячі крильця", "робиться з курячих крилець, маринованих у гірчиці та соевому соусі. Запікаеться на грилі.", 28);
        Dish fish = new Dish("Риба", "робиться з карпа. Запікається в духовці.", 35) ;
        Dish salad = new Dish("Салат", "робиться з огірків, помідорів, цибулі, листя салату та сиру. Заправляється олією.", 25);
        Dish fries = new Dish("Картопля фрі", "робиться з картоплі. Вариться у фрітюрниці.", 23);

        dishesList.put(steak.name, steak);
        dishesList.put(chickenWings.name, chickenWings);
        dishesList.put(fish.name, fish);
        dishesList.put(salad.name, salad);
        dishesList.put(fries.name, fries);
    }

    private static void createDrinksList(){
        Drink lemonade = new Drink("Лимонад", "робиться з лимонів, цукру та води", 14);
        Drink cocaCola = new Drink("Кока кола", "робиться з газированої водию цукру та коки", 18);
        Drink coffee = new Drink("Кава", "робиться з кофейних зерен та гарачої води", 12) ;
        Drink tea = new Drink("Чай", "робиться з огірків, помідорів, цибулі, листя салату та сиру. Заправляється олією.", 11);
        Drink mineralWater = new Drink("Мінеральна вода", "робиться з газированої води", 15);

        drinksList.put(lemonade.name, lemonade);
        drinksList.put(cocaCola.name, cocaCola);
        drinksList.put(coffee.name, coffee);
        drinksList.put(tea.name, tea);
        drinksList.put(mineralWater.name, mineralWater);
    }

    public static Map<String, Dish> getDishesList() {
        return dishesList;
    }

    public static Map<String, Drink> getDrinksList() {
        return drinksList;
    }
}


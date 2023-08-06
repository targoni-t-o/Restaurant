package resturant.orders;

import java.util.Map;
import java.util.HashMap;

public class Menu {
    private static final Map<String, Dish> dishesList = new HashMap<>();
    private static final Map<String, Drink> drinksList = new HashMap<>();

    public static void createMenu() {
        createDishesList();
        createDrinksList();

        System.out.println();
        System.out.println("Сьогоднішнє меню.");

        System.out.println("Страви:");
        for (String dishName:dishesList.keySet()) {
            System.out.println(dishName + " ціна: " + dishesList.get(dishName).getPrice());
        }

        System.out.println();
        System.out.println("Напої:");
        for (String drinkName:drinksList.keySet()) {
            System.out.println(drinkName + " ціна: " + drinksList.get(drinkName).getPrice());
        }
    }

    private static void createDishesList(){
        Dish steak = new Dish("Стейк", "м`яса яловичини. Можливі різні рівні обжарки.", 40);
        Dish chickenWings = new Dish("Курячі крильця", "робиться з курячих крилець, маринованих у гірчиці та соевому соусі. Запікаеться на грилі.", 28);
        Dish fish = new Dish("Риба", "робиться з карпа. Запікається в духовці.", 35) ;
        Dish salad = new Dish("Салат", "робиться з огірків, помідорів, цибулі, листя салату та сиру. Заправляється олією.", 25);
        Dish fries = new Dish("Картопля фрі", "робиться з картоплі. Вариться у фрітюрниці.", 23);

        dishesList.put(steak.getName(), steak);
        dishesList.put(chickenWings.getName(), chickenWings);
        dishesList.put(fish.getName(), fish);
        dishesList.put(salad.getName(), salad);
        dishesList.put(fries.getName(), fries);
    }

    private static void createDrinksList(){
        Drink lemonade = new Drink("Лимонад", "робиться з лимонів, цукру та води", 14);
        Drink cocaCola = new Drink("Кока кола", "робиться з газированої водию цукру та коки", 18);
        Drink coffee = new Drink("Кава", "робиться з кофейних зерен та гарачої води", 12) ;
        Drink tea = new Drink("Чай", "робиться з огірків, помідорів, цибулі, листя салату та сиру. Заправляється олією.", 11);
        Drink mineralWater = new Drink("Мінеральна вода", "робиться з газированої води", 15);

        drinksList.put(lemonade.getName(), lemonade);
        drinksList.put(cocaCola.getName(), cocaCola);
        drinksList.put(coffee.getName(), coffee);
        drinksList.put(tea.getName(), tea);
        drinksList.put(mineralWater.getName(), mineralWater);
    }

    public static Map<String, Dish> getDishesList() {
        return dishesList;
    }

    public static Map<String, Drink> getDrinksList() {
        return drinksList;
    }
}


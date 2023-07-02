package org.demo.example.premises;

import org.demo.example.Main;
import org.demo.example.personel.Waiter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Hall {
    private final HashMap<String, Boolean> tablesList = new HashMap<>();
    private final ArrayList<Waiter> waitersList = new ArrayList<>();

    public Hall() {
        Random random = new Random();
        int tablesCount = Main.getRandomNumber(1, 5);

        for (int i = 1; i <= tablesCount; i++) {
            this.tablesList.put("Столик " + i, random.nextBoolean());
        }

        Waiter waiter = new Waiter("John", "Dawson");
        waitersList.add(waiter);
    }

    public String getFreeTable(){
        for (String table : tablesList.keySet()) {
            if(tablesList.get(table)){
                return table;
            }
        }

        return "No free tables";
    }

    public void takeOrder(){
        Waiter waiter = waitersList.get(0);
        waiter.takeOrder();
    }
}

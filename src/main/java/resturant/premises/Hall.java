package resturant.premises;

import resturant.Main;
import resturant.personel.Waiter;

import java.util.*;

public class Hall {
    private Map<String, Boolean> tablesList;
    private List<Waiter> waitersList;

    public Hall(Map<String, Boolean> tablesList, List<Waiter> waitersList) {
        this.tablesList = tablesList;
        this.waitersList = waitersList;
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

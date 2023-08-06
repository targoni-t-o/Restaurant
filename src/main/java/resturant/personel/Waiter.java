package resturant.personel;

public class Waiter extends Employee{
    public Waiter(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void takeOrder(){
        System.out.println("Офіціант " + super.getFulName() + " прийме Ваше замовлення.");
    }
}

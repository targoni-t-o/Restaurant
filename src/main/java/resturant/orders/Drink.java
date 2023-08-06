package resturant.orders;

public class Drink {
    private String name;
    private String components;
    private int price;

    public Drink(String name, String components, int price) {
        this.name = name;
        this.components = components;
        this.price = price;
    }

    public void getComponents() {
        System.out.println("Напой " + this.name + " робиться з " + this.components);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

package resturant.orders;

public class Dish {
    private String name;
    private String components;
    private int price;

    public Dish(String name, String components, int price) {
        this.name = name;
        this.components = components;
        this.price = price;
    }

    public void getComponents() {
        System.out.println("Страва " + this.name + " робиться з " + this.components);
    }

    public String getName(){
        return this.name;
    }

    public int getPrice() {
        return price;
    }
}

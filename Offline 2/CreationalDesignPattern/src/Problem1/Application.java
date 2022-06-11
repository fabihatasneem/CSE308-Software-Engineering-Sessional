package Problem1;

import Problem1.QueueSystemPackage.Item;

public class Application implements Item {
    private String name;
    private double price;

    public Application() {
        this.name = "Application";
        this.price = 2000;
    }

    @Override
    public String getItemName() {
        return name;
    }

    @Override
    public double getItemPrice() {
        return price;
    }
}

package Problem1;

import Problem1.QueueSystemPackage.Item;

public class ControlUnit implements Item {
    private String name;
    private double price;

    public ControlUnit() {
        this.name = "Control Unit";
        this.price = 600;
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

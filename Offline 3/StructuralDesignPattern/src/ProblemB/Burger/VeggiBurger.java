package ProblemB.Burger;

import ProblemB.Item;

public class VeggiBurger implements Item {
    @Override
    public String getName() {
        return "Veggi Burger";
    }

    @Override
    public double getPrice() {
        return 300;
    }
}

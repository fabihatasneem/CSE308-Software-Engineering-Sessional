package ProblemB.Burger;

import ProblemB.Item;

public class VeggiBurger implements Item {
    @Override
    public String getName() {
        return "1 Veggi Burger : 1x270 BDT";
    }

    @Override
    public double getPrice() {
        return 270;
    }
}

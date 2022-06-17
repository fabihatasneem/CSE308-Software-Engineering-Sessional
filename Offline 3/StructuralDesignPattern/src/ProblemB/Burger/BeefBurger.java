package ProblemB.Burger;

import ProblemB.Item;

public class BeefBurger implements Item {
    @Override
    public String getName() {
        return "Beef Burger";
    }

    @Override
    public double getPrice() {
        return 350;
    }
}

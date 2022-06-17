package ProblemB.Burger;

import ProblemB.Item;

public class BeefBurger implements Item {
    @Override
    public String getName() {
        return "1 Beef Burger : 1x350 BDT";
    }

    @Override
    public double getPrice() {
        return 350;
    }
}

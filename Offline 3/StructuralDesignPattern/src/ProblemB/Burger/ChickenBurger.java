package ProblemB.Burger;

import ProblemB.Item;

public class ChickenBurger implements Item {
    @Override
    public String getName() {
        return "1 Chicken Burger : 1x340 BDT";
    }

    @Override
    public double getPrice() {
        return 340;
    }
}

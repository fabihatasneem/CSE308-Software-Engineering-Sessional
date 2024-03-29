package ProblemB.Appetizers;

import ProblemB.FoodDecorator;
import ProblemB.Item;

public class OnionRings extends FoodDecorator {

    public OnionRings(Item item) {
        super(item);
    }

    @Override
    public String getName() {
        return item.getName() + ", 1 Onion Rings : 1x150 BDT";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 150;
    }
}

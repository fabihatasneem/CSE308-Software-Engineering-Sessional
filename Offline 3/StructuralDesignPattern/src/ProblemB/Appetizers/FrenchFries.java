package ProblemB.Appetizers;

import ProblemB.FoodDecorator;
import ProblemB.Item;

public class FrenchFries extends FoodDecorator {

    public FrenchFries(Item item) {
        super(item);
    }

    @Override
    public String getName() {
        return item.getName() + ", 1 French Fries : 1x100 BDT";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 100;
    }
}

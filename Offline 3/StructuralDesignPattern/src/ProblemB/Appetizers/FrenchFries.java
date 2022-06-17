package ProblemB.Appetizers;

import ProblemB.FoodDecorator;
import ProblemB.Item;

public class FrenchFries extends FoodDecorator {

    public FrenchFries(Item item) {
        super(item);
    }

    @Override
    public String getName() {
        return item.getName() + ", French Fries";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 100;
    }
}

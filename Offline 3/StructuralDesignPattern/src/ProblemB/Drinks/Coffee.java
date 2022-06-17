package ProblemB.Drinks;

import ProblemB.FoodDecorator;
import ProblemB.Item;

public class Coffee extends FoodDecorator {
    protected int coffeeCount = 0;

    public Coffee(Item item, int coffeeCount) {
        super(item);
        this.coffeeCount = coffeeCount;
    }

    @Override
    public String getName() {
        return item.getName() + ", " + coffeeCount + " Coffee : " + coffeeCount + "x150 BDT";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + (150 * coffeeCount);
    }
}

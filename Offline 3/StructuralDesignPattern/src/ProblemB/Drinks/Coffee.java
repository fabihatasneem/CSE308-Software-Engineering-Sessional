package ProblemB.Drinks;

import ProblemB.FoodDecorator;
import ProblemB.Item;

public class Coffee extends FoodDecorator {
    protected static int coffeeCount = 0;

    public Coffee(Item item) {
        super(item);
        coffeeCount++;
    }

    @Override
    public String getName() {
        return item.getName() + ", Coffee";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 120;
    }

    public int getCount(){
        return coffeeCount;
    }
}

package ProblemB.Drinks;

import ProblemB.FoodDecorator;
import ProblemB.Item;

public class Water extends FoodDecorator {
    protected static int waterCount = 0;

    public Water(Item item) {
        super(item);
        waterCount++;
    }

    @Override
    public String getName() {
        return item.getName() + ", Water";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 15;
    }

    public int getCount(){
        return waterCount;
    }
}

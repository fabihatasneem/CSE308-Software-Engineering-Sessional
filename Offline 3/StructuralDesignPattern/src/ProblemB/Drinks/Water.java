package ProblemB.Drinks;

import ProblemB.FoodDecorator;
import ProblemB.Item;

public class Water extends FoodDecorator {
    private int waterCount = 0;

    public Water(Item item, int waterCount) {
        super(item);
        this.waterCount = waterCount;
    }

    @Override
    public String getName() {
        return item.getName() + ", " + waterCount + " Water : " + waterCount + "x40 BDT";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + (15 * waterCount);
    }

}

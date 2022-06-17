package ProblemB.Drinks;

import ProblemB.FoodDecorator;
import ProblemB.Item;

public class Coke extends FoodDecorator {
    private int cokeCount = 0;

    public Coke(Item item, int cokeCount) {
        super(item);
        this.cokeCount = cokeCount;
    }

    @Override
    public String getName() {
        return item.getName() + ", " + cokeCount + " Coke : " + cokeCount + "x40 BDT";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + (40 * cokeCount);
    }
}

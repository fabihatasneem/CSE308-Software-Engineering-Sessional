package ProblemB.Drinks;

import ProblemB.FoodDecorator;
import ProblemB.Item;

public class Coke extends FoodDecorator {
    protected static int cokeCount = 0;

    public Coke(Item item) {
        super(item);
        cokeCount++;
    }

    @Override
    public String getName() {
        return item.getName() + ", Coke";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 30;
    }

    public int getCount(){
        return cokeCount;
    }
}

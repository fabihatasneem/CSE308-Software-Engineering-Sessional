package ProblemB;

public class Cheese extends FoodDecorator{

    public Cheese(Item item) {
        super(item);
    }

    @Override
    public String getName() {
        return item.getName() + ", 1 Cheese : 1x30 BDT";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 30;
    }
}

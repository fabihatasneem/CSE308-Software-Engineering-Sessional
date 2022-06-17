package ProblemB;

public class Cheese extends FoodDecorator{

    public Cheese(Item item) {
        super(item);
    }

    @Override
    public String getName() {
        return item.getName() + ", Cheese";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 40;
    }
}

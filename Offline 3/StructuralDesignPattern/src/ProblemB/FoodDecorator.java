package ProblemB;

public abstract class FoodDecorator implements Item{
    protected Item item;

    public FoodDecorator(Item item) {
        this.item = item;
    }

    public String getName(){
        return item.getName();
    }

    public double getPrice(){
        return item.getPrice();
    }
}

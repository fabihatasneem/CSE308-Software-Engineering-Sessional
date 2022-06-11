package Problem1.Factory.DisplayPackage;

public class LEDMatrix implements Display{

    private String display;
    private final double price;

    public LEDMatrix() {
        display = "LED Matrix";
        price = 700;
    }

    @Override
    public String getDisplayName() {
        return display;
    }

    @Override
    public double getDisplayPrice() {
        return price;
    }
}

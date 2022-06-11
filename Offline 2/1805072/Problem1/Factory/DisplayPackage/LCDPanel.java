package Problem1.Factory.DisplayPackage;

public class LCDPanel implements Display{

    private String display;
    private final double price;

    public LCDPanel() {
        display = "LCD Panel";
        price = 800;
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

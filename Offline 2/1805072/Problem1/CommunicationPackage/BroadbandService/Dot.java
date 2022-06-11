package Problem1.CommunicationPackage.BroadbandService;

public class Dot extends WifiModule{
    private String moduleName;
    private double price;

    public Dot() {
        this.moduleName = "Wifi Service: Dot Internet";
        this.price = 1500;
    }

    @Override
    public String getItemName() {
        return moduleName;
    }

    @Override
    public double getItemPrice() {
        return price;
    }

    @Override
    public double getYearlyCommunicationCost() {
        return price * 12;
    }
}

package Problem1.CommunicationPackage.BroadbandService;

public class Mazeda extends WifiModule{
    private String moduleName;
    private double price;

    public Mazeda() {
        this.moduleName = "Wifi Service: Mazeda Networks";
        this.price = 1000;
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

package Problem1.CommunicationPackage.BroadbandService;

public class Xplore extends WifiModule{
    private String moduleName;
    private double price;

    public Xplore() {
        this.moduleName = "Wifi Service: Xplore";
        this.price = 800;
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

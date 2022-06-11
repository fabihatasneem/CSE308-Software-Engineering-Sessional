package Problem1.CommunicationPackage.MobileDataService;

public class Airtel extends SIMCard {
    private String simName;
    private double cost;

    public Airtel() {
        this.simName = "Mobile Network: Airtel";
        this.cost = 200;
    }

    @Override
    public String getItemName() {
        return simName;
    }
    @Override
    public double getItemPrice() {
        return cost;
    }

    @Override
    public double getYearlyCommunicationCost() {
        return cost * 12;
    }
}

package Problem1.CommunicationPackage.MobileDataService;

public class Teletalk extends SIMCard {
    private String simName;
    private double cost;

    public Teletalk() {
        this.simName = "Mobile Network: Teletalk";
        this.cost = 100;
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

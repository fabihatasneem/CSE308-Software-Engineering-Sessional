package Problem1.CommunicationPackage.MobileDataService;

public class Banglalink extends SIMCard {
    private String simName;
    private double cost;

    public Banglalink() {
        this.simName = "Mobile Network: Banglalink";
        this.cost = 300;
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

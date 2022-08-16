import java.util.ArrayList;

public class AverageTempObserver extends Observer{

    private ElectronicSystem system;

    public AverageTempObserver(ElectronicSystem system) {
        this.system = system;
        system.addObserverToList(this);
    }

    @Override
    public void calculate() {
        ArrayList<Double> tempList = system.sendTemperaturesList();
        double sum = 0;
        for(double t : tempList){
            sum += t;
        }
        double result = sum/tempList.size();
        System.out.println("Average Temperature is : " + result + " degree Celsius");
    }
}

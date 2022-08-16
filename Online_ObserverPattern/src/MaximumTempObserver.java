import java.util.ArrayList;

public class MaximumTempObserver extends Observer{

    private ElectronicSystem system;

    public MaximumTempObserver(ElectronicSystem system) {
        this.system = system;
        system.addObserverToList(this);
    }

    @Override
    public void calculate() {
        ArrayList<Double> tempList = system.sendTemperaturesList();
        double max = 10;
        for(double t : tempList){
            if(t > max){
                max = t;
            }
        }
        System.out.println("Maximum Temperature is : " + max + " degree Celsius");
    }
}

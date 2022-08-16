import java.util.ArrayList;
import java.util.List;

public class ElectronicSystem {
    private List<Observer> observers = new ArrayList<>();
    ArrayList<Double> temperaturesList;

    public void setTemperaturesList(ArrayList<Double> temperaturesList){
        this.temperaturesList = temperaturesList;
        notifyAllObservers();
    }

    public void addObserverToList(Observer observer){
        observers.add(observer);
    }

    public ArrayList<Double> sendTemperaturesList(){
        return temperaturesList;
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.calculate();
        }
    }
}

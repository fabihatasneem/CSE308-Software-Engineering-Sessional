import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        ElectronicSystem system = new ElectronicSystem();
        new AverageTempObserver(system);
        new MaximumTempObserver(system);

        System.out.println("How many temperature reads do you want to take?");
        int reads = Integer.parseInt(sc.nextLine());

        int count = 0;
        ArrayList<Double> temperatureList = new ArrayList<>();
        while (count < reads) {
            temperatureList.add(random.doubles(10, 40).findAny().getAsDouble());
            System.out.print(++count + " : ");
            system.setTemperaturesList(temperatureList);
            System.out.println();
        }
    }
}

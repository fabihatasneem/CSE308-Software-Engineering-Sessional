package Problem1;

import Problem1.QueueSystemPackage.SystemList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the Queue Management System:\n"+
                "1. Deluxe\n"+
                "2. Optimal\n"+
                "3. Poor");
        String queueOption = scanner.nextLine();
        if(queueOption.equals("1")){
            queueOption = "Deluxe";
        } else if(queueOption.equals("2")){
            queueOption = "Optimal";
        } else if(queueOption.equals("3")){
            queueOption = "Poor";
        } else{
            System.out.println("Invalid Choice.");
            return;
        }

        System.out.println("Choose the Communication System:\n"+
                "1. Wifi Service\n"+
                "2. Mobile Data");
        String communication = scanner.nextLine();
        String communicationDevice = "";

        if(communication.equals("1")){
            communication = "Wifi";
            System.out.println("Choose Wifi Service:\n"+
                    "1. Mazeda\n"+
                    "2. Xplore\n"+
                    "3. Dot Internet");
            communicationDevice = scanner.nextLine();
            if(communicationDevice.equals("1")){
                communicationDevice = "Mazeda";
            } else if(communicationDevice.equals("2")){
                communicationDevice = "Xplore";
            } else if(communicationDevice.equals("3")){
                communicationDevice = "Dot";
            } else{
                System.out.println("Invalid Choice.");
                return;
            }
        }

        else if(communication.equals("2")){
            communication = "Mobile Data";
            System.out.println("Choose Sim Card:\n"+
                    "1. Airtel\n"+
                    "2. Banglalink\n"+
                    "3. Teletalk");
            communicationDevice = scanner.nextLine();
            if(communicationDevice.equals("1")){
                communicationDevice = "Airtel";
            } else if(communicationDevice.equals("2")){
                communicationDevice = "Banglalink";
            } else if(communicationDevice.equals("3")){
                communicationDevice = "Teletalk";
            } else{
                System.out.println("Invalid Choice.");
                return;
            }
        }

        System.out.print("Choose the number of units:");
        int units = Integer.parseInt(scanner.nextLine());

        SystemBuilder systemBuilder = new SystemBuilder();
        SystemList systemList = systemBuilder.buildSystem(queueOption, communication, communicationDevice, units);
        systemList.showItems();
        systemList.getTotalPrice();
    }
}

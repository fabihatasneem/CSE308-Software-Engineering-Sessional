package Problem1.QueueSystemPackage;

import Problem1.CommunicationPackage.Communication;

import java.util.ArrayList;

public class SystemList {
    private ArrayList<Item> items = new ArrayList<>();
    private int units;

    public void addItem(Item item) {
        items.add(item);
    }

    public void setUnits(int units){
        this.units = units;
    }

    public void getTotalPrice(){
        double totalPrice = 0;
        double displayUnitPrice = 0;
        for (Item item : items) {
            if(item instanceof Choice){
                displayUnitPrice = units * item.getItemPrice();
                totalPrice += displayUnitPrice;
            }else{
                totalPrice += item.getItemPrice();
            }
        }
        System.out.println("Number of Display Units: " + units);
        System.out.println("Display Unit Total Price: " + displayUnitPrice);
        System.out.println("Total Price: " + totalPrice);
    }

    public void showItems(){
        System.out.println("Your Queue Management System contains:");
        for (Item item : items){
            System.out.print(item.getItemName()+
                    " --------- Cost : " + item.getItemPrice());
            if(item instanceof Communication){
                System.out.println(", Yearly Communication Cost : " + ((Communication) item).getYearlyCommunicationCost());
            } else{
                System.out.println();
            }
        }
    }

}

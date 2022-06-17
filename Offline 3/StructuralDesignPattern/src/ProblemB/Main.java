package ProblemB;

import ProblemB.Appetizers.*;
import ProblemB.Burger.*;
import ProblemB.Drinks.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item item;
        System.out.println("Welcome to the Burger Shop! Here is our menu:\n" +
                "1. Beef burger with French fry and cheese\n" +
                "2. Veggi Burger with onion rings and Bottle of Water\n" +
                "3. A combo meal with Veggi burger, French Fry and Coke\n" +
                "4. A combo meal with Veggi burger, Onion Rings, Coffee and Water\n" +
                "5. A Beef burger only\n" +
                "Choose your items as you wish. If you are finished, please enter 0.");

        StringBuilder orderDetails = new StringBuilder("Summary of your order:\n");
        double totalPrice = 0;

        while(true){
            int choice = Integer.parseInt(sc.nextLine());
            if(choice == 0){
                break;
            }
            else if(choice == 1){
                item = new BeefBurger();
                item = new FrenchFries(item);
                item = new Cheese(item);
            }
            else if(choice == 2){
                item = new VeggiBurger();
                item = new OnionRings(item);
                item = new Cheese(item);
            }
            else if(choice == 3){
                item = new VeggiBurger();
                item = new FrenchFries(item);
                item = new Coke(item);
            }
            else if(choice == 4){
                item = new VeggiBurger();
                item = new OnionRings(item);
                item = new Coffee(item);
                item = new Water(item);
            }
            else if(choice == 5){
                item = new BeefBurger();
            }
            else{
                System.out.println("Invalid Choice");
                return;
            }
            String str = "Item Name : " + item.getName() + "-------- Price : " + item.getPrice() + "\n";
            orderDetails.append(str);
            totalPrice += item.getPrice();
        }
        System.out.println(orderDetails);
        System.out.println("Total Price : " + totalPrice);
    }
}

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
                "Choose your item as you wish. If you are finished, please enter 0.");

        StringBuilder orderDetails = new StringBuilder("Summary of your order:\n");
        double totalPrice = 0;

        while(true){
            int choice = Integer.parseInt(sc.nextLine());
            if(choice == 0){
                break;
            }
            else if(choice == 1){
                item = new BeefBurger();
                double burgerPrice = item.getPrice();
                item = new FrenchFries(item);
                item = new Cheese(item);
            }
            else if(choice == 2){
                item = new VeggiBurger();
                item = new OnionRings(item);

                System.out.println("How many bottles of water do you want?");
                int count = Integer.parseInt(sc.nextLine());
                item = new Water(item, count);
            }
            else if(choice == 3){
                item = new VeggiBurger();
                item = new FrenchFries(item);

                System.out.println("How many bottles of coke do you want?");
                int count = Integer.parseInt(sc.nextLine());
                item = new Coke(item, count);
            }
            else if(choice == 4){
                item = new VeggiBurger();
                item = new OnionRings(item);

                System.out.println("How many cups of coffee do you want?");
                int count = Integer.parseInt(sc.nextLine());
                item = new Coffee(item, count);

                System.out.println("How many bottles of water do you want?");
                count = Integer.parseInt(sc.nextLine());
                item = new Water(item, count);
            }
            else if(choice == 5){
                item = new BeefBurger();
            }
            else{
                System.out.println("Invalid Choice");
                return;
            }
            System.out.println("Anything else?");

            String str = "Item Name : " + item.getName() + " -------- Price : " + item.getPrice() + " BDT\n";
            orderDetails.append(str);
            totalPrice += item.getPrice();
        }
        System.out.println(orderDetails + "Total Price : " + totalPrice + " BDT");
    }
}

package machine;
import java.util.*;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("The coffee machine has:");
        int milk = 540;
        int water = 400;
        int coffee = 120;
        int cups = 9;
        int money = 550;
        String ch = "hi";
        while ( ch != "exit") {
            System.out.println("write action (buy, fill, take, remaining, exit):");
            
        
        
       
            ch = sc.next();
            switch(ch) {
            case "remaining": {
                System.out.println();
                System.out.println("The coffee machine has:");
                System.out.println(water+" of water");
                System.out.println(milk +" of milk");
                System.out.println(coffee +" of coffee beans");
                System.out.println(cups + " of disposable cups");
                System.out.println("$"+money+" of money");
                System.out.println();
                break;
                
            }
            case "buy": {
                System.out.println();
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                String x = sc.next();
                if (x.equals("1")) {
                   
                    if (water >= 250 && coffee >= 16 && cups >= 1 ) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water = water - 250;
                        coffee = coffee -16;
                        cups = cups - 1;
                        money = money + 4;
                    }
                    else if ( water < 250 )
                    {
                        System.out.println("Sorry, not enough water!");
                    }
                    else if (coffee < 16 )
                    {
                        System.out.println("Sorry, not enough coffee!");
                    }
                    else {
                        System.out.println("Sorry, not enough cups!");
                    }
                    
                    
                }
                else if (x.equals("2")) {
                    
                    if (water >= 350 && coffee >= 20 && cups >= 1  && milk >= 75) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water = water - 350;
                        coffee = coffee -20;
                        cups = cups - 1;
                        milk = milk - 75;
                        money = money + 7;
                    }
                    else if ( water < 350 )
                    {
                        System.out.println("Sorry, not enough water!");
                    }
                    else if (coffee < 20 )
                    {
                        System.out.println("Sorry, not enough coffee!");
                    }
                    else if (cups < 1) {
                        System.out.println("Sorry, not enough cups!");
                    }
                    else {
                        System.out.println("Sorry, not enough milk!");
                    }
                    
                    
                    
                }
                else if (x.equals("3")) {
                    
                    if (water >= 200 && coffee >= 12 && cups >= 1  && milk >= 100) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water = water - 200;
                        coffee = coffee -12;
                        cups = cups - 1;
                        milk = milk - 100;
                        money = money + 6;
                    }
                    else if ( water < 200 )
                    {
                        System.out.println("Sorry, not enough water!");
                    }
                    else if (coffee < 12 )
                    {
                        System.out.println("Sorry, not enough coffee!");
                    }
                    else if (cups < 1) {
                        System.out.println("Sorry, not enough cups!");
                    }
                    else {
                        System.out.println("Sorry, not enough milk!");
                    }
                    
                }
                else{
                    continue;
                }
                System.out.println();
                break;
               
               
            }
            case "take": {
                System.out.println();
                System.out.println("I gave you $" + money);
                money = 0;
                System.out.println();
                break;
            }
            case "fill": {
                System.out.println();
                System.out.println("Write how many ml of water do you want to add:");
                int newwater = sc.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int newmilk = sc.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int newcoffee = sc.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int newcups = sc.nextInt();
                water = water + newwater;
                milk = milk + newmilk;
                cups = cups + newcups;
                coffee = coffee +newcoffee;
                System.out.println();
                break;
                
                
            }
            case "exit": {
                System.exit(0);
            }
           }
        }
        
    }
}

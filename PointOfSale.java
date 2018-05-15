/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;
import java.util.Scanner;

/**
 *
 * @author Will
 */
public class PointOfSale {

    /**
     * @param args the command line arguments
     */
    
    // variables
    private static int burgersOrdered = 0;
    private static int friesOrdered = 0;
    private static int burgersMade = 0;
    private static int burgerTotal = 20;
    private static int friesTotal = 20;
    private static int friesMade = 0;
    private static int userBurgers;
    private static int userFries;
    
    // scanners for user input
    private static Scanner userBurgerScanner = new Scanner(System.in);
    private static Scanner userFrieScanner = new Scanner(System.in);
    
    // main only calls methods to do jobs.
    public static void main(String[] args) {
        
                intro();
                orderBurgers(userBurgers);
                orderFries(userFries);
                printStoreStats();
      }
                
              
    
    // gets new totals based on user input in intro(), calcs burgers ordered
    public static void orderBurgers (int userBurgers) {
        System.out.println("Cooking up some burgers now!");
        burgerTotal = burgerTotal - userBurgers;
        burgersOrdered = burgersOrdered + userBurgers;   
}
    // gets new totals based on user input in intro(), calcs fries ordered
    public static void orderFries(int userFries) {
        System.out.println("Cooking up some fries now!");
        friesTotal = friesTotal - userFries;
        friesOrdered = friesOrdered + userFries;
    }
    
    // prints stats for user to see
    public static void printStoreStats(){
        System.out.println("Burgers made:" + " " + burgersOrdered);
        System.out.println("Fries made" + " " + friesOrdered);
        System.out.println("Burgers left:" + " " + burgerTotal);
        System.out.println("Fries left:" + " " + friesTotal);
}
    // introduces program
    public static void intro(){
    {System.out.println("Yo, welcome to Petey's. Lemme take ya orda'!");
        System.out.println("Burgers in stock:" + " " + burgerTotal);
        System.out.println("Fries in stock:" + " " + friesTotal);
        
                System.out.println("-----------------------");
                System.out.println("After looking at the menu, you decide to have:");
                System.out.println("How many burgers?");
                // assigns amount of user burgers to variable using scanner
                userBurgers = userBurgerScanner.nextInt();
                if (userBurgers > burgerTotal) { 
                    System.out.println("Looks like someone's greedy! Grr.. I better not owe Sal no pattys!");
                 } 
                
                
                System.out.println("How many fries?");
               
                // assigns amount of user fries to variable using scanner
                userFries = userFrieScanner.nextInt();
                if (userFries > friesTotal) { 
                    System.out.println("Looks like someone's greedy! Grr.. I better not owe Sal no fries!");
                }
}
    }
}

   



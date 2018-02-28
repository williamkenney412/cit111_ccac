
package tripCalc;
import java.util.Scanner;


/**
 *
 * @author Will
 */

public class CheckFuel {
    
    public static void main(String []args) {
        // declaring variables to be used in program
        double MPG;
        double userFuel;
        double distanceToStation;
        
        //make scanners
        Scanner fuelScanner = new Scanner(System.in);
        Scanner milesScanner = new Scanner(System.in);
        Scanner mpgScanner = new Scanner(System.in);

        // checking the users fuel
        System.out.println("How much fuel do you have?");
        userFuel = fuelScanner.nextDouble(); 
        if (userFuel < 0)
            System.out.println("Please enter a positive value.");
        
                   
        // check the users MPG
        System.out.println("How many miles per gallon does your "
                + "car get?");
        MPG = mpgScanner.nextDouble();
        if (MPG < 0)
            System.out.println("Please enter a positive value.");
        
       /** calculate the number of miles a car 
       can drive on a given volume of gas */
         
        double availableDistance = MPG * userFuel;
             
        
        //check distance to next station
        System.out.println("How many miles till next station?");
        distanceToStation = milesScanner.nextDouble();
        
        /** compare distance to next station(distanceToStation) to
         * the amount of miles the car can travel with the remaining
         * gas(availableDistance) to see if they'll make it. Output
         * result to user
         */
      
        if (availableDistance >= distanceToStation) 
        {
            System.out.println("You're gonna be alright. You had " + (availableDistance-distanceToStation) + " miles left over.");
        }
            else
        {
            // get value of leftover miles since they will be negative, display positive
            double milesWalked = (availableDistance - distanceToStation) * -1;
            
            // calculate how much gas would have been needed to make it to station
            double gasNeeded = milesWalked / MPG;
         
            System.out.println("Hope you're good with walking today! You need to walk " + milesWalked + " miles to reach the next gas station.");
            
            System.out.println("You'd need " + gasNeeded + " gallons of gas to get your car to the next station from here.");
        } // end else
        
    } // end main
    
} // end CheckFuel

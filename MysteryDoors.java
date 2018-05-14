
package mysterydoors;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Will
 */
public class MysteryDoors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, and welcome to the Mystery Door game! Please selelct a door.");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        
        /// makes new scanner, stores value user inputs into variable
       Scanner choiceScanner = new Scanner(System.in);
       int userChoice = choiceScanner.nextInt();
       
       System.out.println("Okay, now pick something at random.");
       System.out.println("1.");
       System.out.println("2.");
       System.out.println("3.");
       
       // make switch statement, passing it user choice, door outcomes follow
       switch(userChoice) {
           case 1: door1();
           chooseOutcome();
               break;
           case 2: door2();
           chooseOutcome();
               break;
           case 3: door3();
           chooseOutcome();
               break;
                   
       }
   
        
        
    }
    // printing basic text for printing doors, execute in main
  public static void door1() {
           System.out.println("You've selected door 1, here we go!");
       }  
  public static void door2() {
      System.out.println("You've selected door 2, here we go!");
  }
  public static void door3() {
      System.out.println("You've selected door 3, here we go!"); 
  }
  
  // randomizes outcome user experiences, different one everytime
  public static void chooseOutcome() {
      Random outcome = new Random();
      
      int i = outcome.nextInt(3) + 1;
      switch(i) {
          case 1:
              System.out.println("You've fallen into a pit. Oh dear. Good luck with that!");
          break;
          case 2:
              System.out.println("You've been bitten by snakes! Oh dear. Good luck with that!");
              break;
          case 3:
              System.out.println("You've been granted a million dollars by an anonymous source! Congrats!");
              break;
      }
      
  }
}

        


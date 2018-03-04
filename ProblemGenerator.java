
package mathProgram;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Will
 */
public class ProblemGenerator {
    public static void main(String[] args) {
        // make a Scanner to take the users answer
        Scanner answerScanner = new Scanner(System.in);
        
        // get random numbers(50 is max, 1 is min)
        Random rand1 = new Random();
        Random rand2 = new Random();
        
        // assign random numbers to variables
        int x = rand1.nextInt(50) + 1;
        int y = rand2.nextInt(50) + 1;
        int userAnswer;
        int count = 0;
        boolean userCorrect = false;
        boolean gameOver = false;
        

               
        
        // make variable z = correct answer of equation
        int z = x + y;
        
        //intro
        System.out.println("Can you solve this problem? You have 3 tries!");
       
        // create problem for user to answer
        System.out.println(x + " + " + y + " = ?");
        
        // user submits answer, value is stored as integer in variable "userAnswer"
        userAnswer = answerScanner.nextInt();
        
        // if for checking. if userAnswer = z, congratulate them,
        
            if(z == userAnswer) {
                userCorrect = true;
            System.out.println("Good job boss, you're pretty smart!");
            gameOver = true;
        }
        // if userAnswer != z, tell them so, and give them a hint, add +1 to incorrect count
            
       else if(z != userAnswer) {
           userCorrect = false;
           do { 
           count++;
           
           // if count is at 3, end game, display correct answer
          if(count == 3) {
                System.out.println("You're out of tries, the correct answer was " + z);
                System.out.println("-----------------------");
                System.out.println(x + " + " + y + " = " + z);
              
                gameOver = true;
           } // close if
          // if count isn't at 3, let them try again, with hint
           else if (count != 3) {
            System.out.println("You were close, but no.");
            System.out.println("Incorrect attempts: " + count);
             // if higher
            if(userAnswer > z) {
                System.out.println("Try a little bit lower this time.");
            }
            else if(userAnswer < z) {
                System.out.println("Try a little bit higher this time.");
                }
            // replace old answer with new one in userAnswer variable
            System.out.println("Type your new answer below:");
            userAnswer = answerScanner.nextInt();
             } // close else if
               // check to see if they got it right again
            if(z == userAnswer) {
            System.out.println("Good job boss, you're pretty smart!");
            userCorrect = true;
            gameOver = true;
                } // close if
           } while(gameOver != true);
          } // close else if
       } // close main
    } // close problemGenerator
  
      

    


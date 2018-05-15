
package unitconverter;
import java.util.Scanner;
/**
 *
 * @author Will
 */
public class UnitConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  System.out.println("Please enter your unit measurement.");
  
  // scannner stores user input. stores in measurement
  Scanner userScanner = new Scanner(System.in);
 double measurement = userScanner.nextDouble();
  
 // menu
  System.out.println("Please select a unit for your entered value.");
  System.out.println("1. Inches");
  System.out.println("2. Yards");
  System.out.println("3. Centimeters");
  
  // scanner stores first unit type
  Scanner firstUnitScanner = new Scanner(System.in);
  int unitTypeOne = firstUnitScanner.nextInt();
 
  // menu
  System.out.println("Please select the unit you would like to convert to.");
  System.out.println("1. Inches");
  System.out.println("2. Yards.");
  System.out.println("3. Centimeters");
  
  // scanner stores second unit type
  Scanner secondUnitScanner = new Scanner(System.in);
int unitTypeTwo = secondUnitScanner.nextInt();

// do math, give result
switch(unitTypeOne) {
    case 1:
        inchesConvert(unitTypeTwo, measurement);
        break;
    case 2:
        yardConvert(unitTypeTwo, measurement);
        break;
    case 3:
        centimeterConvert(unitTypeTwo, measurement);
        break;
               
        
}
    }

    
    // method for converting inches to other things
    public static double inchesConvert(int unitTypeTwo, double measurement) {
        double convertedAnswer = 0;
                switch(unitTypeTwo) {
            case 2:
                //conv to yards
                convertedAnswer = measurement * 0.027778;
                System.out.println("Your new number is" + " " + convertedAnswer);
                break;
                //conv to centimeters
            case 3:
            convertedAnswer = measurement * 2.54;
            System.out.println("Your new number is" + " " + convertedAnswer);
            break;
        }
        return convertedAnswer;
    }
    
    // method for converting yards to other things
    public static double yardConvert(int unitTypeTwo, double measurement) {
        double convertedAnswer = 0;
        switch(unitTypeTwo) {
            case 1:
                // conv to inches
                convertedAnswer = measurement * 36;
                System.out.println("Your new number is" + " " + convertedAnswer);
                break;
            case 3:
                // conv to centimeters
            convertedAnswer = measurement * 91.44;
            System.out.println("Your new number is" + " " + convertedAnswer);
            break;
        }
        return convertedAnswer;    
    }
    // converting cetimeters to the other options based on what the user selected
    public static double centimeterConvert(int unitTypeTwo, double measurement) {
        double convertedAnswer = 0;
        switch(unitTypeTwo) {
            // conv to inches
            case 1:
                convertedAnswer = measurement * 0.393701;
                System.out.println("Your new number is" + " " + convertedAnswer + " inches." );
                break;
                // conv to yards
            case 2:
            convertedAnswer = measurement * 0.0109361;
            System.out.println("Your new number is" + " " + convertedAnswer + " ");
            break;
        }
        return convertedAnswer;
    }
}

  // conversions
    
     
   


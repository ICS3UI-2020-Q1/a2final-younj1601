import java.util.Scanner;
/**
 *This program will ask the diameter of the pizza then output the subtotal, taxes, final total and a little message
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    //prompt for diameter of pizza
    System.out.println("What is the size of the pizza (in cm):");
    //get the diameter from the user
    int diameter = input.nextInt();

    //calculate the subtotal
    double subTotal = diameter*0.5 + 0.99 + 0.75;

    //tell the user their subtotal
    System.out.println("Subtotal: $" + subTotal);
    
    //calculate the taxes
    double taxes = subTotal*0.13;

    //tell the user the taxes
    System.out.println("Taxes: $" + taxes);

    //calculate the final total
    double total = subTotal + taxes;

    //tell the user their final total
    System.out.println("Total: $" + total);

    //figure out what message to read from the diameter
    //between 1 and 20 cm
    if (diameter >= 1 && diameter <= 20){
      //diameter is bigger than or equal to 1 AND
      //diameter is less than or equal to 20
      System.out.println("We are going to make you a cute little pizza!");
      //between 21 and 40 cm
    } else if (diameter >= 21 && diameter <=40){
      //diameter is bigger than or equal to 21 AND
      //diameter is less than or equal to 40
      System.out.println("This will be delicious!");
      //diamete over 40 cm
    } else if (diameter > 40){
      //diameter is bigger than 40
      System.out.println("Whoa, big pizza! You might need a truck to get this home!");
    }
  }
}

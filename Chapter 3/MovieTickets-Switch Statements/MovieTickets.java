
/**
 * Write a description of class MovieTickets here.
 *
 *Ansh Tewatia
 * 9/21/2026
 */

import java.util.Scanner;
import java.text.NumberFormat;
public class MovieTickets
{
 public static void main(String[] args) {
    //Create constant variables, which CAN'T be changed
    final double REGULAR_PRICE= 12.50;
    final double DISCOUNT_PRICE= 8.00;
    final double IMAX_SURCHARGE= 5.00;
    final double IMAX_70MM_SURCHARGE= 8.00;
    
    
    
    Scanner scan = new Scanner(System.in);
    NumberFormat money= NumberFormat.getCurrencyInstance();
    
    System.out.println("---Movie Ticket Calculator---");
    System.out.println("Select Movie Format:");
    System.out.println("2-IMAX");
    System.out.println("3-IMAX 70mm (As Nolan Intended)");
    System.out.print("Enter choice (1-3): ");
    int format = scan.nextInt();
    
    
    
    System.out.println("Enter the customer's age: ");
    int age = scan.nextInt();
    
    //Set matinee to true if the user enters "y"
    System.out.print("Is this a matinee showtime? (y/n)" );
    String isMatinee = scan.next();
    boolean matinee =false;
      
    switch (isMatinee) {
        case "y":
            matinee= true;
            break;
        default:
            matinee= true;
            break;
    }
    //set pass to true  if the user enters "y"
    System.out.print("Does the customer have a pass? (y/n)" );
    String hasPass = scan.next();
    boolean pass= hasPass.toLowerCase().equals("y");
    
    double ticketPrice;
    //Discount applies if <13, >=65 OR its a matinee and they have pass
    
    switch (format) {
        case 1:
            if (age<13 || age >= 65) {
                ticketPrice= DISCOUNT_PRICE;
                System.out.println("Status: Discount Applied!");
                
            }
            else {
                ticketPrice=REGULAR_PRICE;
                System.out.println("Status: Regular Rate Applied.");
                
        
            }
            break;
        case 2:
            ticketPrice=REGULAR_PRICE+IMAX_SURCHARGE;
            System.out.println("Status: IMAX Surcharge Applied.");
            break;
        case 3:
            ticketPrice=REGULAR_PRICE+  IMAX_70MM_SURCHARGE;
            System.out.println("Status: IMAX 70mm Surcharge Applied.");
            break;
        default:
            ticketPrice=REGULAR_PRICE;
            break;
    }
    
    System.out.println("Total Due: "+money.format(ticketPrice));
}   
}



/**
 *Weekly Budget
 *Ansh Tewatia
 *Last updated: 8/21/2026
 */

import java.util.Scanner;
import java.text.NumberFormat;


public class WeeklyBudget
{
    //Calculate weekly lunch spending and remaining money
    public static void main(String[] args) {
        String name;
        double allowance, lunchPrice, totalCost, remaining;
        int lunchesPerWeek;
        
        NumberFormat money= NumberFormat.getCurrencyInstance();

        
        // Instantiate the Scanner object to read from the keyboard
        Scanner scan = new Scanner (System.in);
        
        // Read a String (Object)
        System.out.print("Enter your name: ");
        name= scan.nextLine();
        
        // Read doubles (floating point number)
        System.out.print("Enter your weekly allowance: $");
        allowance = scan.nextDouble();
        
        System.out.print("Enter the price of one school lunch: $");
        lunchPrice= scan.nextDouble();
        
        //Read an integer
        System.out.print("Enter the number of school lunches you ordered this week");
        lunchesPerWeek=scan.nextInt();
        
        //Perfomr calculations (Arithmetic expressions)
        totalCost=lunchPrice*lunchesPerWeek;
        remaining=allowance-totalCost;

        //printf allows placeholders for strings using %s
        System.out.printf("---Weekly Budget summary for %sn---", name);

        
        System.out.printf("%-25s %s%n", "Weekly allowance", money.format(allowance));
        System.out.printf("%-25s %s%n", "Total spent on lunches:", money.format(totalCost));
        System.out.printf("%-25s %s%n", "Money remaining:", money.format(remaining));
        
        
        
    }   
}

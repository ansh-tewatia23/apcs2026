
/**
 * Write a description of class LedgerProcessor here.
 *
 * @author Ansh Tewatia
 * @version 9/30/26
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
public class LedgerProcessor
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //Connect Scanner allows Java to handle an error
        //The file MUST be in the same folder as the project
        
        File dataFile = new File("transactions.txt");
        Scanner fileScan= new Scanner(dataFile);
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        //Counter and accumalator variables
        int count = 0;
        double totalSales= 0.0;
        
        System.out.println("=== Daily Transactions Ledger ===");
        
        // The loop will run while there is another line in the file
        while (fileScan.hasNextLine()) {
            double line= fileScan.nextDouble();
            double price =line; 
            
            //Update our counter and accumulator
            count++;
            totalSales += price;
            
            System.out.println("Transaction #"+count+": "+money.format(price));
            
            
            
        }
        
        //Always close file streams when finished 
        fileScan.close();
        
        double averageSales= totalSales/count;
        
        System.out.println("Total items sold: "+count);
        System.out.println("Total Revenue: "+money.format(totalSales));
        System.out.println("Average Transaction: "+ money.format(averageSales));
        
    }
}

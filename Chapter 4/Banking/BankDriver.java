
/**
 * Write a description of class BankDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankDriver
{
    public static void main(String[] args) {
        //Create BankAccount objects using constructors 
        BankAccount acc1 = new BankAccount("Ansh", 1000.0);
        BankAccount acc2 = new BankAccount(); //Uses the default constructor
        
        if (acc1.withdraw(250.00)== true) {
            System.out.println("You succesfully withdrew $250. You have $"+acc1.getBalance()+" left in the account.");
        }
        else {
            System.out.println("You don't have enough money");
        }
        if (acc2.withdraw(250.00)== true) {
            System.out.println("You succesfully withdrew $250.");
        }
        else {
            System.out.println("You don't have enough money");
        }
        
        
        acc1.applyInterest(4.0,12); //Apply a 4% annual rate
        
        System.out.println(acc1);
        //System.out.println(acc2);
    }
}

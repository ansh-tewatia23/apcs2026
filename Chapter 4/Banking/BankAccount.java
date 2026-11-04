
/**
 * Write a description of class BankAccount here.
 *
 * Ansh Tewatia
 * 11/4/2026
 */
public class BankAccount
{
    // Encapsulated instance data
    private String accountHolder;
    private double balance;
    private int transactionCount;
    
    //Constant definition
    private static final double MIN_BALANCE=0.0;
    
    //Step 3;Create the Class Constructor (S)
    //Default constructor (no parameters
    public BankAccount() {
        //this refers to the current instance of the class (object)
        this.accountHolder = "Unnamed";
        this.balance= 0.0;
        this.transactionCount=0;
    }
    //Overloaded Constructor with Parameters
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder= accountHolder;
        if (initialBalance>=MIN_BALANCE) {
            this.balance=initialBalance;
        }
        else {
            this.balance=MIN_BALANCE;
        }
        this.transactionCount=0;
    }
    
    // Withdraw the given amount
    public boolean withdraw(double amount) {
        if (balance >= amount || amount>0) {
            balance-=amount;
            transactionCount++;
            return true;
        }
        return false;
    }
    
    
    
    
    
    
    
    
    
    
    
}

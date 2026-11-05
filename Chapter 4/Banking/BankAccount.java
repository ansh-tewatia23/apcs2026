
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
    //mutator method (method that changes a class variable)
    public boolean withdraw(double amount) {
        if (balance >= amount && amount>0) {
            balance-=amount;
            transactionCount++;
            return true;
        }
        return false;
    }
    
    
    //Adds interest to the account balance (Mutator method)
    public void applyInterest(double annualRate, int months) {
        double monthlyRate= (annualRate/100.0)/12;
        for (int m=1; m<=months; m++) {
            balance+=balance * monthlyRate;
        }
    }
    
    
    public double getBalance() {
        return this.balance;
    }
    
    
    //The toString method determines what string is returned when you try to print a BankAccont object
    public String toString() {
        return "Account: "+this.accountHolder+" | Balance: $"+
            String.format("%.2f", balance)+ " | Transactions: "+ 
            this.transactionCount;
    }
    
    
}

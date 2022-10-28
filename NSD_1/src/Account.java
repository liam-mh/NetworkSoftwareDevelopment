import java.util.Date;

public class Account {

    //Default values
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    Date d = new Date();
    private String dateCreated = d.toString();

    //Creating a default account
    public Account () {}
    //Creating an account with custom inputs for id and balance
    public Account (int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    //Get account information
    public int getId () {
        return id;
    }
    public double getBalance () {
        return balance;
    }
    public double getAnnualInterestRate () {
        return annualInterestRate;
    }
    public String getDateCreated () {
        return dateCreated;
    }

    //Set account information
    public void setAccountDetails (int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = (annualInterestRate/100);
    }


    //Interest
    public double getMonthlyInterestRate () {
        double monthlyInterestRate = annualInterestRate / 12;
        return monthlyInterestRate;
    }
    public double getMonthlyInterest () {
        double monthlyInterest = (balance * getMonthlyInterestRate()/100);
        return monthlyInterest;
    }

    //Withdraw
    public void withdraw (double withdrawalAmount) {
        this.balance -= withdrawalAmount;
    }
    //Deposit
    public void deposit (double depositAmount) {
        this.balance += depositAmount;
    }

    //Print details
    public void printAccount () {
        System.out.println("Account ID: "+getId());
        System.out.println("Balance: £"+getBalance());
        System.out.println("Monthly Interest Rate %"+getMonthlyInterestRate());
        System.out.println("Monthly Interest £"+getMonthlyInterest());
        System.out.println("Account Open Date "+getDateCreated());
    }

}

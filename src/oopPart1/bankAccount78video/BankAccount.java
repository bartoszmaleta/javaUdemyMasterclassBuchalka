package oopPart1.bankAccount78video;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
        // "this..." ---> must be the first statement in constructor body 
        this("123", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }    

    public BankAccount(String accountNumber, double balance
    , String customerName, String customerEmail
    , String customerPhoneNumber) {
        System.out.println("BankAccount constructor with parameters called");

        // ONE APPROACH:
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        
        // SECOND APPROACH:
        // setAccountNumber(accountNumber);
        // setBalance(balance);
        // setCustomerName(customerName);
        // setCustomerEmail(customerEmail);
        // setCustomerPhoneNumber(customerPhoneNumber);    
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("9999", 100.55, customerName, customerEmail, customerPhoneNumber);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFund(double depositedFunds) {
        this.balance = balance + depositedFunds;
        System.out.println("Deposit of " + depositedFunds + " processed.");
        System.out.println("Right now You have = " + this.balance);
    }

    public void withdrawFunds(double withdrawalFunds) {
        if (this.balance >= withdrawalFunds) {
            this.balance -= withdrawalFunds;
            System.out.println("You withdrawed = " + withdrawalFunds);
            System.out.println("Remaining balance = " + this.balance);
        } else {
            System.out.println("You tried to withdraw = " + withdrawalFunds);
            System.out.println("Not enough funds on account.");
            System.out.println("Right now You have = " + this.balance);
        }
    }
}
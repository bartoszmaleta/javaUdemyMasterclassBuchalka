package oopPart1.bankAccount78video;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNumber;

    // private double depositedFunds;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
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

    public int getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // public double getDepositedFunds() {
    // return this.depositedFunds;
    // }
    // public void setDepositedFunds(double depositedFunds) {
    // this.depositedFunds = depositedFunds;
    // }

    public void depositFund(double depositedFunds) {
        this.balance = balance + depositedFunds;
    }

    public void withdrawFunds(double withdrawalFunds) {
        if (balance > withdrawalFunds) {
            this.balance = balance - withdrawalFunds;
        } else {
            System.out.println("Not enough funds on account");
        }
    }
}
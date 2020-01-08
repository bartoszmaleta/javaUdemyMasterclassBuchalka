package oopPart1.bankAccount78video;

public class MainBankAccount {
    public static void main(String[] args) {
        // FIRST SOLUTION, WITHOUT CONSTRUCTOR IN BANKACCOUNT CLASS
        // BankAccount bartoszSecondAccount = new BankAccount();
// 
        // System.out.println("-------------------");
// 
        // System.out.println(bartoszSecondAccount.getCustomerPhoneNumber());
        // System.out.println(bartoszSecondAccount.getCustomerName());
        // System.out.println(bartoszSecondAccount.getCustomerEmail());
// 
        System.out.println("-------------------");
        BankAccount bartoszAccount= new BankAccount();


        // BankAccount bartoszAccount = new BankAccount("456789123", 0.00
        // , "John Smiht", "john.smith@gmail.com", "+48 456 789 123");
        
        System.out.println("-------------------");

        System.out.println(bartoszAccount.getCustomerPhoneNumber());
        System.out.println(bartoszAccount.getCustomerName());
        System.out.println(bartoszAccount.getCustomerEmail());
        System.out.println("-------------------");


        // bartoszAccount.setAccountNumber("456789123"); 
        // bartoszAccount.setBalance(0.00);
        // bartoszAccount.setCustomerName("John Smith");
        // bartoszAccount.setCustomerEmail("john.smith@gmail.com");
        // bartoszAccount.setCustomerPhoneNumber("+48 456 789 123");

        bartoszAccount.setBalance(5000);
        System.out.println("Balance = " + bartoszAccount.getBalance());
        System.out.println("-------------------");

        bartoszAccount.depositFund(2000);
        System.out.println("Balance = " + bartoszAccount.getBalance());
        System.out.println("-------------------");

        bartoszAccount.withdrawFunds(7000);
        System.out.println("Balance = " + bartoszAccount.getBalance());
        System.out.println("-------------------");

        BankAccount safeAccount = new BankAccount("Tim", "tim@email.com", "34234");
        System.out.println(safeAccount.getAccountNumber() + " name " + safeAccount.getCustomerName());

        System.out.println("-------------------");

    }
}
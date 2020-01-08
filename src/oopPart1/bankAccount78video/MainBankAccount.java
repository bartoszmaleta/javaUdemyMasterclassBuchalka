package oopPart1.bankAccount78video;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setBalance(5000);
        System.out.println("Balance = " + bankAccount.getBalance());

        bankAccount.depositFund(2000);
        System.out.println("Balance = " + bankAccount.getBalance());

        bankAccount.withdrawFunds(1000);
        System.out.println("Balance = " + bankAccount.getBalance());

    }
}
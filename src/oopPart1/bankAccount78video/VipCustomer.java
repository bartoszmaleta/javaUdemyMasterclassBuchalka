package oopPart1.bankAccount78video;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("defaultName", 50.00, "defaultEmail");
    }

    public VipCustomer(String name, String email) {
        this(name, 100, email);
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }
    public double getCreditLimit() {
        return this.creditLimit;
    }
    public String getEmail() {
        return this.email;
    }

}
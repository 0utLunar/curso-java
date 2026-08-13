package entities;

public class Account {

    private final int NUMBER;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.NUMBER = number;
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return NUMBER;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.00;
    }

    public String toString() {
        return "Account: "
                + NUMBER
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}

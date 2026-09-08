public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        // TODO: add the amount to the balance
    }

    public boolean withdraw(double amount) {
        if (balance - amount >= 50.0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String getAccountSummary() {
        return accountHolder + ": $" + balance;
    }
}
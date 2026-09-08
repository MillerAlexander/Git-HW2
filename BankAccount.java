public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        double totalDeduction = amount + 2.0;
        if (balance - totalDeduction >= 50.0) {
            balance -= totalDeduction;
            return true;
        }
        return false;
    }

    public String getAccountSummary() {
        return accountHolder + ": $" + balance;
    }
}
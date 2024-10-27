public class CheckingAccount extends BankAccount {
    private int overdraftCount = 0;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            // Assume balance is updated
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            if (overdraftCount == 0) {
                System.out.println("First overdraft, charged $20.");
                overdraftCount++;
                // Apply $20 penalty
            } else {
                System.out.println("Further overdraft, charged $30.");
                // Apply $30 penalty
            }
            // balance -= (amount + penalty);
        }
    }
}

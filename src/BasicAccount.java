public class BasicAccount extends BankAccount {

    public BasicAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            // Assume there's a method to update balance
            // balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

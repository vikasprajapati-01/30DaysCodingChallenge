class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayBalance() {
        System.out.println("Account Balance: $" + balance);
    }
}

public class Main {

    public static void main(String[] args) {
        // Create two bank accounts
        Account account1 = new Account("123456", 1000.0);
        Account account2 = new Account("789012", 500.0);

        // Perform transactions
        account1.deposit(200.0);
        account1.withdraw(50.0);
        account1.displayBalance();

        account2.deposit(300.0);
        account2.withdraw(100.0);
        account2.displayBalance();
    }
}

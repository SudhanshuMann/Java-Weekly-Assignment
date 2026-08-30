public class BankAccount {
    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.accountHolder = "Rahul";
        account.balance = 10000;

        account.deposit(5000);
        account.withdraw(2500);

        account.display();
    }
}

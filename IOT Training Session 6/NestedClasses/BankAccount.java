package NestedClasses;
public class BankAccount {
    private double balance = 10000;
    // inner member class
    class Transaction {
        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdraw: " + amount);
            } else {
                System.out.println("Insufficient Funds");
            }
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        // creating inner class object
        BankAccount.Transaction tx = account.new Transaction();
        tx.withdraw(3000);
        tx.withdraw(5000);
        System.out.println("Final Balance: " + account.balance);
    }
}

//ℹ️ Points to remember
//⭐ Transaction belongs to specific account
//⭐ Direct access to private variable balance
//⭐ clean encapsulation
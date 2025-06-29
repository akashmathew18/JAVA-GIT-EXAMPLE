public class BankSystem {

    // Transaction class
    static class Transaction {
        private BankAccount fromAccount;
        private BankAccount toAccount;
        private double amount;
        private String status;

        public Transaction(BankAccount fromAccount, BankAccount toAccount, double amount, String status) {
            this.fromAccount = fromAccount;
            this.toAccount = toAccount;
            this.amount = amount;
            this.status = status;
        }

        public String getDetails() {
            return "Transaction Status: " + status +
                    "\nFrom: " + fromAccount.getAccountHolder() +
                    "\nTo: " + toAccount.getAccountHolder() +
                    "\nAmount: " + amount +
                    "\nSender Balance: " + fromAccount.getBalance() +
                    "\nReceiver Balance: " + toAccount.getBalance();
        }
    }

    // BankAccount class
    static class BankAccount {
        private String accountHolder;
        private double balance;
        private static int accountCount = 0; // static variable

        public BankAccount(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
            accountCount++; // increment on new account creation
        }

        public String getAccountHolder() {
            return accountHolder;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public boolean withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                return true;
            } else {
                return false;
            }
        }

        public Transaction transfer(BankAccount target, double amount) {
            if (this.withdraw(amount)) {
                target.deposit(amount);
                return new Transaction(this, target, amount, "Success");
            } else {
                return new Transaction(this, target, amount, "Failed: Insufficient Funds");
            }
        }

        public static int getAccountCount() {
            return accountCount;
        }
    }

    // Main method
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1000);
        BankAccount acc2 = new BankAccount("Bob", 500);

        Transaction txn = acc1.transfer(acc2, 300);
        System.out.println(txn.getDetails());

        System.out.println("\nTotal Accounts: " + BankAccount.getAccountCount());
    }
}

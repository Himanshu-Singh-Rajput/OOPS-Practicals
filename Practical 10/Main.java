class BankAccount {
    private String accHolder;
    private int accNumber;
    private double balance;

    BankAccount(String h, int n, double b) {
        accHolder = h;
        accNumber = n;
        balance = b;
    }

    String getHolder() {
        return accHolder;
    }

    int getNumber() {
        return accNumber;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amt) {
        if (amt > 0) {
            balance = balance + amt;
            System.out.println("Deposited: " + amt);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amt) {
        if (amt <= 0) {
            System.out.println("Invalid withdraw amount!");
        } else if (amt > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - amt;
            System.out.println("Withdrawn: " + amt);
        }
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ravi", 101, 5000.0);

        System.out.println("Holder: " + acc.getHolder());
        System.out.println("Acc No: " + acc.getNumber());
        System.out.println("Initial Balance: " + acc.getBalance());
        System.out.println();

        System.out.println("Valid Transactions --");
        acc.deposit(2000.0);
        acc.withdraw(1000.0);
        System.out.println("Current Balance: " + acc.getBalance());
        System.out.println();

        System.out.println("Invalid Transactions --");
        acc.deposit(-500.0);
        acc.withdraw(0);
        acc.withdraw(10000.0);
        
        System.out.println();
        System.out.println("Final Balance: " + acc.getBalance());
    }
}

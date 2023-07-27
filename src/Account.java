class Account {
    protected int accountId;
    protected double balance;

    public Account(int accountId) {
        this.accountId = accountId;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void calculateInterest() {
        // Default implementation (no interest calculation)
    }

    public double getBalance() {
        return balance;
    }
}

/*
Bank :
Account types: savings and checking..
A customer need to create an account in the bank..
A customer can deposit money in it and withdraw the money.
Interest rate for checking will be 5% for saving it is 8%.
A customer can withdraw the money from savings account with the included interest.. min duration for collecting the interest was 1-year
Checking account it is 2 years
 */

class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.08;
    private static final int MIN_DURATION_FOR_INTEREST = 12; // Minimum duration for collected interest is 1 year (12 months)

    public SavingsAccount(int accountId) {
        super(accountId);
    }

    @Override
    public void withdraw(double amount) {
        // Savings account allows withdrawals after the minimum duration has passed
        if (MIN_DURATION_FOR_INTEREST <= 0) {
            super.withdraw(amount);
            System.out.println("Withdrawal successful from Savings account.");
        } else {
            System.out.println("Savings account: You can withdraw after " + MIN_DURATION_FOR_INTEREST + " months.");
        }
    }

    @Override
    public void calculateInterest() {
        // Savings account has an interest rate of 8%, compounded monthly
        double monthlyInterestRate = INTEREST_RATE / 12;
        double interest = balance * monthlyInterestRate;
        balance += interest;
        System.out.println("Savings account interest calculated: $" + interest);
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
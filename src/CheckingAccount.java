class CheckingAccount extends Account {
    private static final double INTEREST_RATE = 0.05;
    private static final int MIN_DURATION_FOR_INTEREST = 24; // Minimum duration for collected interest is 2 years (24 months)

    public CheckingAccount(int accountId) {
        super(accountId);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Checking account: You can withdraw anytime.");
        super.withdraw(amount);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Checking account interest calculated: $" + interest);
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

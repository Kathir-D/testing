import java.util.*;
public class Bank {
    private Map<Integer, Account> accounts;
    private int accountIdCounter;

    public Bank() {
        accounts = new HashMap<>();
        accountIdCounter = 1000; // Start account ID from 1000
    }

    public void createAccount(String accountType) {
        int accountId = accountIdCounter++;
        if (accountType.equalsIgnoreCase("checking")) {
            accounts.put(accountId, new CheckingAccount(accountId));
            System.out.println("Checking account created with ID: " + accountId);
        } else if (accountType.equalsIgnoreCase("savings")) {
            accounts.put(accountId, new SavingsAccount(accountId));
            System.out.println("Savings account created with ID: " + accountId);
        } else {
            System.out.println("Invalid account type.");
        }
    }

    public Account getAccountById(int accountId) {
        return accounts.get(accountId);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- Bank Menu -----");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Display Balance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter account type (Checking/Savings): ");
                    String accountType = scanner.nextLine();
                    bank.createAccount(accountType);
                    break;
                case 2:
                    System.out.print("Enter account ID: ");
                    int accountId = scanner.nextInt();
                    Account accountToDeposit = bank.getAccountById(accountId);
                    if (accountToDeposit != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        accountToDeposit.deposit(depositAmount);
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account ID: ");
                    accountId = scanner.nextInt();
                    Account accountToWithdraw = bank.getAccountById(accountId);
                    if (accountToWithdraw != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        accountToWithdraw.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account ID: ");
                    accountId = scanner.nextInt();
                    Account accountToCalculateInterest = bank.getAccountById(accountId);
                    if (accountToCalculateInterest != null) {
                        accountToCalculateInterest.calculateInterest();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter account ID: ");
                    accountId = scanner.nextInt();
                    Account accountToDisplayBalance = bank.getAccountById(accountId);
                    if (accountToDisplayBalance != null) {
                        System.out.println("Account ID: " + accountId + ", Balance: $" + accountToDisplayBalance.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
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

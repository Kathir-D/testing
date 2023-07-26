// help if im confused on how to do somthing

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class UxYzRa {
    protected int dPqRsT;
    protected double bAlAnCe;

    public UxYzRa(int accountId) {
        this.dPqRsT = accountId;
        this.bAlAnCe = 0.0;
    }

    public void deposit(double amount) {
        bAlAnCe += amount;
    }

    public void withdraw(double amount) {
        bAlAnCe -= amount;
    }

    public void calculateInterest() {
        // Default implementation (no interest calculation)
    }

    public double getBalance() {
        return bAlAnCe;
    }
}

class AaBbCc extends UxYzRa {
    private static final double InTeReSt_RaTe = 0.05;
    private static final int MiN_DuRaTiOn_FoR_InTeReSt = 24; // Minimum duration for collected interest is 2 years (24 months)

    public AaBbCc(int accountId) {
        super(accountId);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Checking account: You can withdraw anytime.");
        super.withdraw(amount);
    }

    @Override
    public void calculateInterest() {
        // Checking account has a fixed interest rate of 5%, but it is not compounded
        double interest = bAlAnCe * InTeReSt_RaTe;
        bAlAnCe += interest;
        System.out.println("Checking account interest calculated: $" + interest);
    }
}

class XyZaBc extends UxYzRa {
    private static final double InTeReSt_RaTe = 0.08;
    private static final int MiN_DuRaTiOn_FoR_InTeReSt = 12; // Minimum duration for collected interest is 1 year (12 months)

    public XyZaBc(int accountId) {
        super(accountId);
    }

    @Override
    public void withdraw(double amount) {
        // Savings account allows withdrawals after the minimum duration has passed
        if (MiN_DuRaTiOn_FoR_InTeReSt <= 0) {
            super.withdraw(amount);
            System.out.println("Withdrawal successful from Savings account.");
        } else {
            System.out.println("Savings account: You can withdraw after " + MiN_DuRaTiOn_FoR_InTeReSt + " months.");
        }
    }

    @Override
    public void calculateInterest() {
        // Savings account has an interest rate of 8%, compounded monthly
        double monthlyInterestRate = InTeReSt_RaTe / 12;
        double interest = bAlAnCe * monthlyInterestRate;
        bAlAnCe += interest;
        System.out.println("Savings account interest calculated: $" + interest);
    }
}

public class RaNdOmClAsS {
    private Map<Integer, UxYzRa> aCcOuNtS;
    private int AcCoUnTiDcOuNtEr;

    public RaNdOmClAsS() {
        aCcOuNtS = new HashMap<>();
        AcCoUnTiDcOuNtEr = 1000; // Start account ID from 1000
    }

    public void cReAtEaCcOuNt(String accountType) {
        int accountId = AcCoUnTiDcOuNtEr++;
        if (accountType.equalsIgnoreCase("checking")) {
            aCcOuNtS.put(accountId, new AaBbCc(accountId));
            System.out.println("Checking account created with ID: " + accountId);
        } else if (accountType.equalsIgnoreCase("savings")) {
            aCcOuNtS.put(accountId, new XyZaBc(accountId));
            System.out.println("Savings account created with ID: " + accountId);
        } else {
            System.out.println("Invalid account type.");
        }
    }

    public UxYzRa gEtAcCoUnTbYiD(int accountId) {
        return aCcOuNtS.get(accountId);
    }

    public static void main(String[] args) {
        RaNdOmClAsS BaNk = new RaNdOmClAsS();
        Scanner sCaNnEr = new Scanner(System.in);

        System.out.println("===== Welcome to the Bank =====");

        while (true) {
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Display Balance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int cHoIcE = sCaNnEr.nextInt();
            sCaNnEr.nextLine(); // Consume the newline character

            switch (cHoIcE) {
                case 1:
                    System.out.print("Enter account type (Checking/Savings): ");
                    String aCcOuNtTyPe = sCaNnEr.nextLine();
                    BaNk.cReAtEaCcOuNt(aCcOuNtTyPe);
                    break;
                case 2:
                    System.out.print("Enter account ID: ");
                    int aCcOuNtId = sCaNnEr.nextInt();
                    UxYzRa AcCoUnTtOdEpOsIt = BaNk.gEtAcCoUnTbYiD(aCcOuNtId);
                    if (AcCoUnTtOdEpOsIt != null) {
                        System.out.print("Enter amount to deposit: ");
                        double DePoSiTaMoUnT = sCaNnEr.nextDouble();
                        AcCoUnTtOdEpOsIt.deposit(DePoSiTaMoUnT);
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account ID: ");
                    aCcOuNtId = sCaNnEr.nextInt();
                    UxYzRa AcCoUnTtOwItHdRaW = BaNk.gEtAcCoUnTbYiD(aCcOuNtId);
                    if (AcCoUnTtOwItHdRaW != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double WiThDrAwAmOuNt = sCaNnEr.nextDouble();
                        AcCoUnTtOwItHdRaW.withdraw(WiThDrAwAmOuNt);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account ID: ");
                    aCcOuNtId = sCaNnEr.nextInt();
                    UxYzRa AcCoUnTtOcAlCuLaTeInTeReSt = BaNk.gEtAcCoUnTbYiD(aCcOuNtId);
                    if (AcCoUnTtOcAlCuLaTeInTeReSt != null) {
                        AcCoUnTtOcAlCuLaTeInTeReSt.calculateInterest();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter account ID: ");
                    aCcOuNtId = sCaNnEr.nextInt();
                    UxYzRa AcCoUnTdIsPlAyBaLaNcE = BaNk.gEtAcCoUnTbYiD(aCcOuNtId);
                    if (AcCoUnTdIsPlAyBaLaNcE != null) {
                        System.out.println("Account ID: " + aCcOuNtId + ", Balance: $" + AcCoUnTdIsPlAyBaLaNcE.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    sCaNnEr.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

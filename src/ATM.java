import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int bal = 1000;

        System.out.println("----MENU----");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        int option;
        do {
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("How much do you want to withdraw.");
                    int wd = sc.nextInt();
                    if (wd > bal) {
                        System.out.println("Insufficient Balance");
                    } else {
                        bal = bal - wd;
                        System.out.println("Withdrawn: " + bal +
                                "Current balance: " + bal);
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    int depo = sc.nextInt();
                    bal += depo;
                    System.out.println("Deposit successful. Updated balance: $" +
                            bal);
                    break;
                case 3:
                    System.out.println("Current balance: $ " + bal);
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invaild choice try again.");
                    break;
            }
        }
        while (option != 4);
    }
}



/* 1. Withdraw
2. Deposit
3. Check Balance
4. Exit
 */


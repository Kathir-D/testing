import java.util.*;

import java.util.Scanner;
public class BankAccount {

    public int bal = 500; // ballance

    public void deposit(){
        bal += 100; // bal = bal + 100
        System.out.println("Deposited $100");
    }
    public void withdraw(){
        if (bal>100) {
            bal -= 100; // bal = bal - 100
            System.out.println("Withdrawn $100");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SavingsAccount SavAcc = new SavingsAccount();

        System.out.println("Deposit" + "\nWithdraw");
        String choice = sc.nextLine();
        switch (choice) {
            case "Deposit" -> SavAcc.deposit();
            case "Withdraw" -> SavAcc.withdraw();
            default -> System.out.println("Error: Invalid Input");
        }
    }


}

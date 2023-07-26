import java.util.Scanner;

public class SavingsAccount extends BankAccount{



    public void withdraw(){
        if (bal<=100){ // checks if bal is equal to or less then 100
            System.out.println("Too little money to withdraw");
        } else if (bal>=101) { // checks for bal and if its above 100
            bal -= 100; // bal = bal - 100
            System.out.println("Withdrawn $100");
        } else return;
    }


}

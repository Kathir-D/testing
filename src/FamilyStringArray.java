import java.util.Scanner;

public class FamilyStringArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int FamilyNumber = 1;

        System.out.println("How many people are in your family");
        int num = sc.nextInt();
        sc.nextLine();

        String[] family = new String[num];

        for (int i = 0; i < family.length; i++) {
            System.out.println("Family member name:");
            family[i] = sc.nextLine();
        }

        System.out.println("Your Family:");

        for (int i = 0; i < family.length; i++) {
            System.out.println(FamilyNumber + ": " + family[i]);
            FamilyNumber++;
        }

    }
}

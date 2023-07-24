//wtf is this
import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<Integer>();
        System.out.println("Enter object 1.");
        int object1 = input.nextLine();
        integers.add(object1);
        System.out.println("Enter object 2.");
        int object2 = input.nextLine();
        integers.add(object2);
        System.out.println("Enter object 3.");
        int object3 = input.nextLine();
        integers.add(object3);
        System.out.println("Enter object 4.");
        int object4 = input.nextLine();
        integers.add(object4);
        System.out.println("Enter object 5.");
        int object5 = input.nextLine();
        integers.add(object5);
        System.out.println("Which one would you like to remove?");
        int remove = input.nextLine();
        for (int x = 0, x < integers.size(), x++) {
            if (integer[x] = remove) {
                integers.remove(x);
            }
        }
        System.out.println(integers);
    }
}
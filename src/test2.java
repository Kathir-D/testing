/*
import java.util.ArrayList;

import java.util.Scanner;
class test2 {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<String>();
        int option;
        boolean exit = true;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Are you trying to 1. add a grocery item, 2. remove an item, 3. display the list, or 4. exit?");
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                        System.out.println("What do you want to add to your grocery list?");
                        groceryList.add(input.nextLine());
                        System.out.println("Do you wish to go 1. exit or 2. add another item?");
                        int exitNumber = input.nextInt();
                        input.nextLine();
                        if (exitNumber == 1){
                            exit = true;
                        }
                        else if (exitNumber == 2) {
                            exit = false;
                        }
                        exit = (exitNumber == 1);
                    break;
                case 2:
                    do {
                        System.out.println("What do you want to remove from your grocery list? \n");
                        groceryList.remove(input.nextLine());
                        System.out.println("Do you wish to go 1. exit or 2. remove another item?");
                        int exitNumber = input.nextInt();
                        input.nextLine(); // Consume the newline character left by nextInt()
                        exit = (exitNumber == 1);
                    } while (!exit);
                    break;
                case 3:
                    do {
                        int listSize = groceryList.size();
                        for (int i = 0; i < listSize; i++) {
                            System.out.println(groceryList.get(i));
                        }
                        System.out.println("Do you wish to go 1. exit or 2. remove another item?");
                        int exitNumber = input.nextInt();
                        input.nextLine();
                        exit = (exitNumber == 1);
                    } while (!exit);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);

        System.out.println("Thank you for using the grocery list application!");
    }
}
*/
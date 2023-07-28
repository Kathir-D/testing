import java.util.LinkedList;
import java.util.Scanner;
public class LinklistInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Display the elements");
            System.out.println("4. Search for an element");
            System.out.println("5. Clear the list");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> { // Option to add an element
                    System.out.println("Enter the element to add:");
                    int addElement = sc.nextInt();
                    linkedList.add(addElement);
                    System.out.println(addElement + " added to the linked list.");
                }
                case 2 -> { // Option to remove an element
                    System.out.println("Enter the element to remove:");
                    int removeElement = sc.nextInt();
                    if (linkedList.contains(removeElement)) {
                        linkedList.remove(removeElement);
                        System.out.println(removeElement + " removed from the linked list.");
                    } else {
                        System.out.println(removeElement + " not found in the linked list.");
                        System.out.println("Try again.");
                    }
                }
                case 3 -> { // Option to display the elements
                    System.out.println("Linked list elements: ");
                    for (int i = 0; i < linkedList.size(); i++) {
                        System.out.println((i + 1) + ": " + linkedList.get(i) + " ");
                    }
                }
                case 4 -> { // Option to search for an element
                    System.out.println("Enter the element to search:");
                    int searchElement = sc.nextInt();
                    if (linkedList.contains(searchElement)) {
                        System.out.println(searchElement + " found in the linked list.");
                    } else {
                        System.out.println(searchElement + " not found in the linked list.");
                    }
                }
                case 5 -> { // Option to clear the list
                    linkedList.clear();
                    System.out.println("Linked list cleared.");
                }
                case 6 -> { // Option to exit the program
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }
}

/*
Write a program to create a linkedlist of integers. allow the user to add, remove, and display the elements of the linkedlist. use different methods.
 */
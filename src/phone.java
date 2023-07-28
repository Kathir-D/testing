import java.util.HashMap;
import java.util.Scanner;

public class phone {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        HashMap<String, String> mh = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String sel = null;
        while (true) {
            System.out.println("----Contact----");
            System.out.println("----List----");
            System.out.println("Add");
            System.out.println("Get");
            System.out.println("Remove");
            System.out.println("Exit");
            System.out.print("Enter a selection: ");

            sel = sc.nextLine().toLowerCase(); // Convert user input to lowercase

            switch (sel) {
                case "add":
                    System.out.println("Enter a name");
                    String name = sc.nextLine();
                    System.out.println("Enter the number for the name");
                    String num = sc.nextLine();
                    hm.put(name, num);
                    mh.put(num, name);
                    break;

                case "get":
                    System.out.println("Name or Number?");
                    String choice = sc.nextLine().toLowerCase(); // Convert user input to lowercase
                    if (choice.equals("name")) {
                        System.out.println("Who do you want the number for?");
                        String get = sc.nextLine();
                        String gets = hm.get(get);
                        if (gets != null) {
                            System.out.println("Name: " + get);
                            System.out.println("Number: " + gets);
                        } else {
                            System.out.println("Error: Invalid Input");
                        }
                    } else if (choice.equals("number")) {
                        System.out.println("What is the number you want the name for?");
                        String nums = sc.nextLine();
                        String hums = mh.get(nums);
                        if (hums != null) {
                            System.out.println("Number: " + nums);
                            System.out.println("Name: " + hums);
                        } else {
                            System.out.println("Error: Invalid Input");
                        }
                    }
                    break;

                case "remove":
                    System.out.println("Name or Number?");
                    String choiceRemove = sc.nextLine().toLowerCase(); // Convert user input to lowercase
                    if (choiceRemove.equals("name")) {
                        System.out.println("Who do you want to remove?");
                        String RemNameName = sc.nextLine();
                        String RemNameNum = hm.get(RemNameName);
                        if (RemNameNum != null) {
                            System.out.println("Name: " + RemNameName);
                            System.out.println("Number: " + RemNameNum);
                            System.out.println("Are you sure you want to remove this person from the hashmap?");
                            System.out.println("Yes");
                            System.out.println("No");
                            String str = sc.nextLine().toLowerCase(); // Convert user input to lowercase
                            if (str.equals("yes")) {
                                hm.remove(RemNameName);
                                mh.remove(RemNameNum);
                                System.out.println("Removed " + RemNameName + " from the hash map");
                            } else {
                                System.out.println("Going back home");
                            }
                        } else {
                            System.out.println("Error: Unknown");
                        }
                    } else if (choiceRemove.equals("number")) {
                        System.out.println("What is the number of the person you want to remove?");
                        String RemNumNum = sc.nextLine();
                        String RemNumName = mh.get(RemNumNum);
                        if (RemNumName != null) {
                            System.out.println("Name: " + RemNumName);
                            System.out.println("Number: " + RemNumNum);
                            System.out.println("Are you sure you want to remove this person from the hashmap?");
                            System.out.println("Yes");
                            System.out.println("No");
                            String str = sc.nextLine().toLowerCase(); // Convert user input to lowercase
                            if (str.equals("yes")) {
                                mh.remove(RemNumNum);
                                hm.remove(RemNumName);
                                System.out.println("Removed " + RemNumName + " from the hash map");
                            } else {
                                System.out.println("Going back home");
                            }
                        }
                    }
                    break;

                case "exit":
                    System.out.println("Exiting...");
                    System.exit(0);
                    return;

                default:
                        System.out.println("Error: Invalid Input");
                    break;
            }
        }
    }
}


/*
create a phone book application using a hashmap to store contacts.
implement functionality to add contacts( name and phone number), display all contacts, search for a contact given a name and remove contacts.
allow user to perform these operations through a menu driver interface
 */
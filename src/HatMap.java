import java.util.HashMap;
import java.util.Scanner;

public class HatMap {
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

            sel = sc.nextLine();
            if (sel.equals("Add")) {
                System.out.println("Enter a name");
                String name = sc.nextLine();
                System.out.println("Enter the number for the name");
                String num = sc.nextLine();
                hm.put(name, num);
                mh.put(num, name);


            } else if (sel.equals("Get")) {
                System.out.println("Name");
                System.out.println("Number");
                String choice = sc.nextLine();
                if (choice.equals("Name")) {
                    System.out.println("Who do you the number for?");
                    String get = sc.nextLine();
                    boolean yep = hm.containsKey(get);
                    if (yep) {
                        String gets = hm.get(get);
                        System.out.println("Name: " + get);
                        System.out.println("Number: " + gets);
                    } else {
                        System.out.println("Error: Invalid Input");
                    }
                } else if (choice.equals("Number")) {
                    System.out.println("What is the number you want the name for?");
                    String nums = sc.nextLine();
                    boolean yep = mh.containsKey(nums);
                    if (yep) {
                        String hums = mh.get(nums);
                        System.out.println("Number: " + nums);
                        System.out.println("Name: " + hums);
                    } else {
                        System.out.println("Error: Invalid Input");
                    }
                }


            } else if (sel.equals("Remove")) {
                System.out.println("Name");
                System.out.println("Number");
                String choice = sc.nextLine();
                if (choice.equals("Name")) {
                    System.out.println("Who do you want to remove?");
                    String RemNameName = sc.nextLine();
                    boolean rev = hm.containsKey(RemNameName);
                    if (rev) {
                        String RemNameNum = hm.get(RemNameName);
                        System.out.println("Name: " + RemNameName);
                        System.out.println("Number: " + RemNameNum);
                        System.out.println("Are you sure you want to remove this person from the hashmap?");
                        System.out.println("Yes");
                        System.out.println("No");
                        String str = sc.nextLine();
                        if (str.equals("Yes")) {
                            hm.remove(RemNameName);
                            mh.remove(RemNameNum);
                            System.out.println("Removed " + RemNameName + " from the hash map");
                        } else {
                            System.out.println("Going back home");
                        }
                    } else {
                        System.out.println("Error: Unkown");
                    }
                } else if (choice.equals("Number")) {
                    System.out.println("Whats the number of the person you want to remove");
                    String RemNumNum = sc.nextLine();
                    boolean m = mh.containsKey(RemNumNum);
                    if (m) {
                        String RemNumName = mh.get(RemNumNum);
                        System.out.println("Name: " + RemNumName);
                        System.out.println("Number: " + RemNumNum);
                        System.out.println("Are you sure you want to remove this person from the hashmap?");
                        System.out.println("Yes");
                        System.out.println("No");
                        String str = sc.nextLine();
                        if (str.equals("Yes")) {
                            mh.remove(RemNumNum);
                            hm.remove(RemNumName);
                            System.out.println("Removed " + RemNumName + " from the hash map");
                        } else {
                            System.out.println("Going back home");
                        }
                    }
                }


            } else if (sel.equals("Jim")) {

            } else if (sel.equals("Exit")) {
                break;
            } else {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Error: Invaild Input");
                }
            }

        }


    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> SchoolRecord = new ArrayList<>();
        SchoolRecord.add("Students: ");

        System.out.println("----School----");
        System.out.println("----Record----");
        System.out.println("Add");
        System.out.println("Get");
        System.out.println("Remove");
        System.out.println("Correction");
        System.out.println("End");

        String name;
        String selection;
        while (true) {
            selection = sc.nextLine();
            if (selection.equals("Add")) {
                System.out.println("Enter the name");
                name = sc.nextLine();
                SchoolRecord.add(name);
                System.out.println("Added " + name + " to the school record");
                int lastValue = SchoolRecord.size() - 1;
                System.out.println("Added as student number: " + lastValue);


            } else if (selection.equals("Get")) {
                System.out.println("What is the student number");
                int rollNum = sc.nextInt();
                sc.nextLine();
                if (rollNum > 0) {
                    System.out.println("Student number: " + rollNum);
                    System.out.println("Student name: " + SchoolRecord.get(rollNum));
                } else {
                    System.out.println("ERROR: Invalid");
                }


            } else if (selection.equals("Remove")) {
                System.out.println("What Student do you want to remove?");
                String choice = sc.nextLine();
                boolean yep = SchoolRecord.contains(choice);
                if (yep) {
                    System.out.println("Student name: " + choice);
                    System.out.println("Are you sure you want to remove this student?");
                    System.out.println("Yes");
                    System.out.println("No");
                    String str = sc.nextLine();
                    int x = SchoolRecord.indexOf(choice);
                    if (str.equals("Yes")) {
                        SchoolRecord.remove(x);
                        System.out.println("Removed " + choice + " from the record.");
                    } else {
                        System.out.println("Error: Unkown");
                    }
                }


            } else if (selection.equals("Correction")) {
                System.out.println("What is the number of the student you want to edit");
                int Correct = sc.nextInt();
                sc.nextLine();
                System.out.println("Student number: " + Correct);
                System.out.println("Student name: " + SchoolRecord.get(Correct));
                System.out.println("Is this information correct?");
                System.out.println("Yes");
                System.out.println("No");
                String str = sc.nextLine();
                if (str.equals("Yes")) {
                    System.out.println("What is the new name?");
                    String Name = sc.nextLine();
                    SchoolRecord.set(Correct, Name);


                } else {
                    System.out.println("ERROR: Invalid");
                }

            } else if (selection.equals("End")) {
                break;


            } else {
                System.out.println("ERROR: Invalid selection");
            }
        }
    }
}

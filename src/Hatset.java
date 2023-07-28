import java.util.*;
public class Hatset {
    public static void main(String[] args) {
        Set<String> namesSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter names (type done when finished):");

        while (true) {
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            namesSet.add(input);
        }

        System.out.println("Unique names entered:");
        for (String name : namesSet) {
            System.out.println(name);
        }
    }
}


/*
Write a java program that takes ames from the user until the user enters "done".
Store theses names in a HashSet to ensure that only unique names are stored.
After the user finishes enterning names, print the names in the hashset.
 */
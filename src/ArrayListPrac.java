import java.util.*;
public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList<String> AL = new ArrayList<>();
        int x = 1;
        Scanner sc = new Scanner(System.in);


        for (int i = 0;i < 5;i++){
            System.out.println("Enter the value for index " + (i+1));
            String adding = sc.nextLine();
            AL.add(adding);
        }

        System.out.println("\nChose Which value to remove");
        for (String ALS : AL) {
            System.out.println(x + ": " + ALS);
            x++;
        }
        System.out.print("Chose your selection: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                AL.remove(0);
                System.out.println("Succsefully removed selection " + choice);
                break;
            case 2:
                AL.remove(1);
                System.out.println("Succsefully removed selection " + choice);
                break;
            case 3:
                AL.remove(2);
                System.out.println("Succsefully removed selection " + choice);
                break;
            case 4:
                AL.remove(3);
                System.out.println("Succsefully removed selection " + choice);
                break;
            case 5:
                AL.remove(4);
                System.out.println("Succsefully removed selection " + choice);
                break;
            default:
                System.out.println("Error: Invalid Input");
        }
        x=1;
        for (String ALS : AL) {
            System.out.println(x + ": " + ALS);
            x++;
        }
    }
}

// You need to store in arraylist then you need to ask the user for which number to be removed. And you remove that value and update the arraylist and print the list.
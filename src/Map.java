import java.util.*;
public class Map {
    public static void main(String[] args) {
        HashMap<String,String> HM = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        int option;
        do
        {
            System.out.println("Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Get Contact Information");
            System.out.println("3. Exit");
            System.out.print("Enter the number: ");
            option = sc.nextInt ();

            switch (option)
            {
                case 1:
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter mobile number: ");
                    String number = sc.nextLine();
                    System.out.println("Enter email: ");
                    String email = sc.nextLine();
                    System.out.println("Enter address: ");
                    String address = sc.nextLine();
                    String Data = ("Number: " + number + "\nEmail: " + email + "\nAddress: " + address);
                    HM.put(name, Data);
                    System.out.println("Contact added successfully!");
                    break;
                case 2:
                    System.out.println("What is the name for the data you want to get?");
                    String na = sc.nextLine();
                    sc.nextLine();
                    if (HM.containsKey(na)){
                        String data = HM.get(na);
                        System.out.println(data);
                    }
                    break;
                case 3:
                    System.out.println ("Exiting");
                    break;
                default:
                    System.out.println ("Invaild choice try again.");
                    break;
            }
        }
        while (option != 3);
    }
}
      /*  <key,value>;
        <Name,num,email,addres> */
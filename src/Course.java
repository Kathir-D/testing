import java.util.*;
public class Course {
    public static void main(String[] args) {
        HashMap<String,String> HM = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        int option;
        do
        {
            System.out.println("----Menu----");
            System.out.println("1. Add Course");
            System.out.println("2. Get Course");
            System.out.println("3. Exit");
            System.out.print("Enter the number: ");
            option = sc.nextInt ();

            switch (option)
            {
                case 1:
                    System.out.print("Enter course name: ");
                    String name = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Enter course refrence number: ");
                    String refrence = sc.nextLine();
                    System.out.print("Enter course subject: ");
                    String subject = sc.nextLine();
                    System.out.print("Enter room location: ");
                    String location = sc.nextLine();
                    System.out.print("Enter instructor: ");
                    String instructor = sc.nextLine();
                    String Data = ("Refrence Number: " + refrence + "\nCourse Subject: " + subject + "\nRoom Location: " + location + "\nInstructor: " + instructor);
                    HM.put(name, Data);
                    System.out.println("Course added successfully!");
                    break;
                case 2:
                    System.out.println("What is the coruse name?");
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
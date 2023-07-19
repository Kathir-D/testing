import java.util.*;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Books = new ArrayList<>();
        Books.add("Books: ");
        Books.add("Harry Potter #1");
        Books.add("Harry Potter #2");
        Books.add("Harry Potter #3");
        Books.add("A Fault In Our Stars");
        Books.add("Looking for Alaska");

        String sel;
        while (true) {
            System.out.println("Admin");
            System.out.println("Student");
            System.out.println("Exit");
            sel = sc.nextLine();

            if (sel.equals("Admin")) {
                String choice;
                while (true) {
                    System.out.println("----Library----");
                    System.out.println("Catalogue");
                    System.out.println("Add");
                    System.out.println("Remove");
                    System.out.println("Exit");
                    choice = sc.nextLine();

                    if (choice.equals("Catalogue")) {
                        for (String book : Books) {
                            System.out.println(book);
                        }
                    } else if (choice.equals("Add")) {
                        System.out.println("What book to add?");
                        String ad = sc.nextLine();
                        System.out.println("Do you want to add " + ad + " to the catalogue?");
                        System.out.println("Yes");
                        System.out.println("No");
                        String str = sc.nextLine();
                        if (str.equals("Yes")) {
                            Books.add(ad);
                            System.out.println("Added " + ad + " to the catalogue");
                        } else {
                            System.out.println("Error: Unknown");
                        }
                    } else if (choice.equals("Remove")) {
                        System.out.println("What book do you want to remove?");
                        String rem = sc.nextLine();
                        if (Books.contains(rem)) {
                            System.out.println(rem + " is in the catalogue");
                            System.out.println("Do you want to remove it?");
                            System.out.println("Yes");
                            System.out.println("No");
                            String str = sc.nextLine();
                            if (str.equals("Yes")) {
                                Books.remove(rem);
                                System.out.println("Removed " + rem + " from the catalogue");
                            } else {
                                System.out.println("Error: Unknown");
                            }
                        } else {
                            System.out.println("Error: Invalid Input or Book not found.");
                        }
                    } else if (choice.equals("Exit")) {
                        break;
                    } else {
                        System.out.println("Error: Invalid Input");
                    }
                }
            } else if (sel.equals("Student")) {
                String selection;
                while (true){
                    System.out.println("----Library----");
                    System.out.println("Catalogue");
                    System.out.println("Check-out");
                    System.out.println("Return");
                    System.out.println("Exit");
                    selection = sc.nextLine();
                    if (selection.equals("Catalogue")){
                        for (int i = 0; i < Books.size(); i++){
                            System.out.println(Books.get(i));
                        }



                    } else if (selection.equals("Check-out")) {
                        System.out.println("What book to checkout: ");
                        String checkout = sc.nextLine();
                        boolean CO = Books.contains(checkout);
                        if (CO == true){
                            System.out.println(checkout + " is in the catalogue");
                            System.out.println("Do you want to check it out?");
                            System.out.println("Yes");
                            System.out.println("No");
                            String str = sc.nextLine();
                            if (str.equals("Yes")){
                                Books.remove(checkout);
                                System.out.println("Removed " + checkout + " from the catalogue");
                                System.out.println("Enjoy your book!");
                            } else {
                                System.out.println("Error: Unknown");
                            }
                        } else {
                            System.out.println("Error: Invalid Input....");
                        }




                    } else if (selection.equals("Return")) {
                        System.out.println("What book do you want to return?");
                        String Return = sc.nextLine();
                        System.out.println("Do you want to return: " + Return);
                        System.out.println("Yes");
                        System.out.println("No");
                        String str = sc.nextLine();
                        if (str.equals("Yes")){
                            Books.add(Return);
                            System.out.println("Added " + Return + " back to the catalogue");
                            System.out.println("Hope you liked it!");
                        } else {
                            System.out.println("Error: Unknown");
                        }


                    } else if (selection.equals("Exit")) {
                        break;
                    } else {
                        System.out.println("Error: Invalid Input....");
                    }
                }
            } else if (sel.equals("Exit")) {
                break;
            } else {
                System.out.println("Error: Invalid Input");
            }
        }
    }
}

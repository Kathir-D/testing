import java.util.Scanner;
     abstract class Employee {

        public String emp_id;
        public String name;
        public String role;

        public Employee(String emp_id, String name) {
            this.emp_id = emp_id;
            this.name = name;
        }

        abstract double calculateSalary();

        abstract public void displayInfo();



         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             while (true) {
                 System.out.print("Enter the job role (Manager/Developer/Salesperson) or 'quit' to exit: ");
                 String role = scanner.nextLine().toLowerCase();

                 if (role.equals("quit")) {
                     break;
                 }

                 Employee employee = null;

                 switch (role) {
                     case "manager":
                         System.out.print("Enter Base Salary: ");
                         double base_salary = scanner.nextDouble();
                         System.out.print("Enter Bonus: ");
                         double bonus = scanner.nextDouble();
                         scanner.nextLine(); // Read the newline character left in the buffer
                         System.out.print("Enter Employee ID: ");
                         String emp_id = scanner.nextLine();
                         System.out.print("Enter Name: ");
                         String name = scanner.nextLine();
                         employee = new Manager(emp_id, name, base_salary, bonus);
                         break;
                     case "developer":
                         System.out.print("Enter Base Salary: ");
                         double base_salary_dev = scanner.nextDouble();
                         System.out.print("Enter Bonus: ");
                         double bonus_dev = scanner.nextDouble();
                         scanner.nextLine(); // Read the newline character left in the buffer
                         System.out.print("Enter Employe ID: ");
                         String emp_id_dev = scanner.nextLine();
                         System.out.print("Enter Name: ");
                         String name_dev = scanner.nextLine();
                         employee = new Developer(emp_id_dev, name_dev, base_salary_dev, bonus_dev);
                         break;
                     case "salesperson":
                         System.out.print("Enter Base Salary: ");
                         double base_salary_sales = scanner.nextDouble();
                         System.out.print("Enter Bonus: ");
                         double bonus_sales = scanner.nextDouble();
                         scanner.nextLine(); // Read the newline character left in the buffer
                         System.out.print("Enter Employe ID: ");
                         String emp_id_sales = scanner.nextLine();
                         System.out.print("Enter Name: ");
                         String name_sales = scanner.nextLine();
                         employee = new Salesperson(emp_id_sales, name_sales, base_salary_sales, bonus_sales);
                         break;
                     default:
                         System.out.println("Invalid input. Please try again.");
                         continue;
                 }

                 System.out.println("\nEmployee Information:");
                 employee.displayInfo();
                 System.out.println();
             }

         }

     }

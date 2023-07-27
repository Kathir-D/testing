import java.util.Scanner;

public class Employeee {
        int salary;
        int hoursWorked;
        final String name;

        public Employeee(String name) {
        this.name = name;
        }

        public void getInfo(int hoursWorked, int salary) {
            this.hoursWorked = hoursWorked;
            this.salary = salary;
        }

        public void addSalary() {
            if (salary < 200) {
                salary += 10;
            }
        }

        public void additionalWork() {
            if (hoursWorked > 6) {
                salary += 5;
            }
        }

        public int getSalary() {
            return salary;
        }

        public int getHoursWorked(){
            return hoursWorked;
        }


    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("What's your name: ");
            String x = sc.nextLine();
            System.out.print("What's the number of hours worked: ");
            int y = sc.nextInt();
            System.out.print("What's your salary: ");
            int z = sc.nextInt();

            Employeee prof = new Employeee(x);
            prof.getInfo(y, z); // Starting values
            prof.addSalary(); // Adding 10 to the salary
            prof.additionalWork(); // Adding 5$ to the salary because hours worke
            int finalSalary = prof.getSalary(); // Getting the final salary of the professor
            System.out.println("Final Salary of Professor " + prof.name + ": $" + finalSalary);

        }
    }


/*
Q6 Create a class 'Employee' with below requirements and print the final salary:

=> name of employee is final

=>use runtime polymorphism.

1. getInfo() method that takes the number of hours of work per day and salary of employee as parameter.

2. addSalary() method that will add 10$ to the salary of the employee if it is less than 200$.

3. additionalWork() method that will add 5$ to the salary of the employee if the hours spent on work is more than 6 hours.

Sub class: professor…'
 */
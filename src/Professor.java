class Professor extends Employeee {
    public Professor(String name) {
        super(name);
    }


    public void addSalary() {
        if (salary < 200) {
            salary += 10;
            System.out.println("Added $10 to salary of " + name);
        } else {
            System.out.println("Error: Salary too high");
        }
        return;
    }

    public void additionalWork() {
        if (hoursWorked < 6) {
            salary += 5;
            System.out.println("Added $5 to salary of " + name);
        } else{
            System.out.println("Error: hours too high");

        }
        return;
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
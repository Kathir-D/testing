import mathoperations.Addition;
import mathoperations.Division;
import mathoperations.Multiplication;
import mathoperations.Subtraction;
import java.util.Scanner;

public class mathoperationsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want the value of a to be?");
            int a = sc.nextInt();
            System.out.println("What do you want the value of b to be?");
            int b = sc.nextInt();

            System.out.println("What operation do you want to do: add, subtract, multiply, divide, or quit?");
            String operation = sc.next().toLowerCase();

            switch (operation) {
                case "add":
                    // Addition
                    int resultAdd = Addition.add(a, b);
                    System.out.println(a + " + " + b + " = " + resultAdd);
                    break;
                case "subtract":
                    // Subtraction
                    int resultSub = Subtraction.subtract(a, b);
                    System.out.println(a + " - " + b + " = " + resultSub);
                    break;
                case "multiply":
                    // Multiplication
                    int resultMul = Multiplication.multiply(a, b);
                    System.out.println(a + " * " + b + " = " + resultMul);
                    break;
                case "divide":
                    // Division
                    try {
                        double resultDiv = Division.divide(a, b);
                        System.out.println(a + " / " + b + " = " + resultDiv);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "quit":
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }
        }
    }
}

import java.util.Scanner;
public class AnimalsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) { // Infinite loop to continuously ask for user input

            System.out.print("Enter the animal you want to hear about(Cow,Cat,Dog or quit): ");
            String animal = sc.nextLine().toLowerCase();
            switch (animal) { // Switch statement for user imput
                case "cow": // If user input is cow
                    Animals cow = new Cow();
                    System.out.println("The cow says " + cow.makeSound() + " and starts " + cow.move());
                    break;
                case "cat": // If user input is cat
                    Animals cat = new Cat();
                    System.out.println("The cat says " + cat.makeSound() + " and starts " + cat.move());
                    break;
                case "dog": // If user input is dog
                    Animals dog = new Dog();
                    System.out.println("The dog says " + dog.makeSound() + " and starts " + dog.move());
                    break;
                case "quit": // If user input is quit
                    System.exit(0);// Exit the program
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}

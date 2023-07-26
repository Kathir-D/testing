import java.util.Scanner;
public class ov3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ov1 objov1 = new ov1(); // create obj for ov1
        ov2 objov2 = new ov2(); // create obj for ov2

        System.out.println("What message do you want to overload to write");
        String i = sc.nextLine();

        System.out.println("calling makesound from ov1");
        objov1.makeSound();
        System.out.println("Calling makesound from ov2");
        objov2.makeSound();
        System.out.println("Callihg makesound from ov2 with overload");
        objov2.makeSound(i);

    }
}

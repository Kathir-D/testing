import java.util.Scanner;

public class Scope {
    public int x = 10;

    public void doubleX(int x) {
        this.x = x; // doubles x
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        Scope ex = new Scope();
        Scope ex2 = new Scope();

        System.out.println("Original x2: " + ex2.x);
        System.out.println("Original x: " + ex.x); // origonal value of x

        ex2.doubleX(40);
        ex.doubleX(20); // calls doubleX and updates ex.x

        System.out.println("Updated x2: " + ex2.x);
        System.out.println("Updated x: " + ex.x); // updated value of x
    }
}

public class P2 {
    public static void main(String[] args) {

        P1 obj1 = new P1(); // make obj
        System.out.println("Public variable: " + obj1.publicVar); // prints public obj
        obj1.publicMethod(); // calls publicMethod from P1

        System.out.println("Default variable: " + obj1.defaultVar); // prints default obj
        obj1.defaultMethod(); // calls defaultMethod from P1

        System.out.println("Protected variable: " + obj1.protectedVar); // prints protected obj
        obj1.protectedMethod(); // calls protectedMethod from P1

        System.out.println("You cant call a private method from a different file");

    }
}

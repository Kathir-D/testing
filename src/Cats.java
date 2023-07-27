public class Cats extends Animal {
    public Cats() {
        super("Woof"); // Call the superclass constructor with the sound "Woof"
    }

    public void sounds() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Cats cat = new Cats();
        cat.sounds();
        cat.makeSound();
    }
}
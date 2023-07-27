public class Cats extends Animal {
    public Cat() {
        super("Woof"); // Call the superclass constructor with the sound "Woof"
    }

    public void sounds() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sounds();
        cat.makeSound();
    }
}
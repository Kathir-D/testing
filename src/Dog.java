public class Dog implements Animals {

    @Override // Override the abstract methods from the Animals class
    public String makeSound() {
        return "Woof";
    }

    @Override // Override the abstract methods from the Animals class
    public String move() {
        return "Runs";
    }
}

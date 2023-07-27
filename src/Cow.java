public class Cow implements Animals {

    @Override // Override the abstract methods from the Animals class
    public String makeSound() {
        return "Moo";
    }

    @Override // Override the abstract methods from the Animals class
    public String move() {
        return "Trotting";
    }
}
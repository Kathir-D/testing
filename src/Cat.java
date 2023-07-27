public class Cat implements Animals {

    @Override // Override the abstract methods from the Animals class
    public String makeSound() {
        return "Meow";
    }

    @Override // Override the abstract methods from the Animals class
    public String move() {
        return "Walks";
    }
}

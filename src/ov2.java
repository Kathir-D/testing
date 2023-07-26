public class ov2 extends ov1 {

    void makeSound(){ //overide
        System.out.println("Bark");
    }

    void makeSound(String x){ //overload
        System.out.println(x);
    }
}

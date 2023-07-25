// Single inheritance
public class ClassB1 extends ClassA1 {
    public ClassB1() {
        super("YIPPE");
    }

    public void sounds() {
        System.out.println("JAVA");
    }

    public static void main(String[] args) {
        ClassB1 C = new ClassB1();
        C.sounds();
        C.MS();
    }
}
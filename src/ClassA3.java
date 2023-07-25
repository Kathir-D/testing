// Hierarchical inheritance
public class ClassA3 {

    public int Size;
    public int Bounciness;
    public int Color;

    public ClassA3(int StartSize, int StartBounciness, int StartColor) {
        Size = StartSize;
        Bounciness = StartBounciness;
        Color = StartColor;
    }

    public void setSize(int i) {
        Size = i;
    }

    public int getSize() {
        return Size;
    }

    public int getBounciness() {
        return Bounciness;
    }

    public int getColor() {
        return Color;
    }

    public static void main(String[] args) {
        ClassC3 obj2 = new ClassC3(42, 10, 5);
        System.out.println("Size: " + obj2.getSize());
        System.out.println("Color: " + obj2.getColor());
        System.out.println("Bounciness: " + obj2.getBounciness());
    }
}

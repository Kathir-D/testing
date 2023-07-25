public class ClassA2 {

    public int Size;

    public ClassA2(int StartSize){
        Size = StartSize;
    }

    public void setSize(int i){
        Size = i;
    }

    public int getSize(){
        return Size;
    }


    public static void main(String[] args) {
        ClassC2 obj = new ClassC2(42, 10, 5);
        System.out.println("Size: " + obj.getSize());
        System.out.println("Color: " + obj.getColor());
        System.out.println("Bouncienes: " + obj.getBouncienes());
    }

}
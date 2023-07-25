// Hierarchical inheritance
public class ClassC2 extends ClassB2 {

    public int Bouncienes;

    public ClassC2(int StartColor, int StartSize, int StartBouncienes){
        super(StartColor, StartSize);
        Bouncienes = StartBouncienes;
    }

    public void setBouncienes(int z){
        Bouncienes = z;
    }

    public int getBouncienes(){
        return Bouncienes;
    }
}
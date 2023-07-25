
public class ClassC3 extends ClassA3 {

    public ClassC3(int StartColor, int StartSize, int StartBounciness){
        super(StartSize,StartBounciness,StartColor);
        Bounciness = StartBounciness;
    }

    public void setBounciness(int z){
        Bounciness = z;
    }


}
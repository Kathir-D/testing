
public class ClassB3 extends ClassA3 {


    public ClassB3(int StartColor, int StartSize, int StartBounciness){
        super(StartSize, StartColor,StartBounciness);
        Color = StartColor;
    }

    public void setColor(int x){
        Color = x;
    }


}
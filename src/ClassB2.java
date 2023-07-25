// Multilevel inheritance
public class ClassB2 extends ClassA2 {

    public int Color;

    public ClassB2(int StartColor, int StartSize){
        super(StartSize);
        Color = StartColor;
    }

    public void setColor(int x){
        Color = x;
    }

    public int getColor(){
        return Color;
    }
}

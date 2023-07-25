public class StaticCircleCall{
    public static void main(String[] args) {
        double radius = 5; // puts var Radius to 5
        double area = StaticCircle.CalcArea(radius); // calls StaticCircle.CalcArea from the previous file StaticCircle.java and equals that to area
        System.out.println("Radius: " +  radius + "\nArea: " + area); // prints the data
    }
}
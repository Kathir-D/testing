import java.util.*;
public class StaticCircle {

    public static double PI = Math.PI; // puts Pi into a variable

    public static double CalcArea(double radius) { // puts CalcArea to calculate area from user given radius
        double Area = PI * radius * radius;
        return Area;
    }

    public static int Rands(int bound){ // sets Rands to make a random number in the bounds set by the user
        Random randoms = new Random();
        int x = randoms.nextInt(bound);
        return x;
    }
}









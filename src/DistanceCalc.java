import java.util.*;
public class DistanceCalc
{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        double distance = 0;
        double time;
        double speed;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter time period " + (i + 1) + " in hours");
            time = sc.nextDouble();
            System.out.println("Enter speed for time period " + (i + 1) + " in mph");
            speed = sc.nextDouble();
            distance += speed * time;
        }
        System.out.println(distance + " mi");
    }
}

/* Distance problem
Ask for the 3 speeds
Ask for the 3 distances
distance equals speed times time.
 */
import java.util.*;
public class GradingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] grades = {"A+", "A", "B", "C", "D", "Fail"};
        System.out.print("Enter your grade: ");
        int grade = sc.nextInt();
        int x = grade / 10;
        switch (x) {
            case 10:
                System.out.println(grades[0]);
                break;
            case 9:
                System.out.println(grades[0]);
                break;
            case 8:
                System.out.println(grades[1]);
                break;
            case 7:
                System.out.println(grades[2]);
                break;
            case 6:
                System.out.println(grades[3]);
                break;
            case 5:
                System.out.println(grades[4]);
                break;
            default:
                System.out.println(grades[5]);
                break;
        }
    }
}

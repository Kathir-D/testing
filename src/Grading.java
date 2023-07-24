import java.util.*;
public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int grade = sc.nextInt();

        String[] grades = {"A+", "A", "B", "C", "D", "Fail"};
        int[] marks = {90, 80, 70, 60, 50, 0};

        for (int i = 0; i < grades.length; i++) {
            if (grade >= marks[i]) {
                System.out.println(grades[i]);
                break;
            }
        }
    }
}

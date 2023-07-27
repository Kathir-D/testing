import java.util.Scanner;

public class HealthMonitorMain {
    public static void main(String[] args) {
        HealthMonitor healthMonitor = new HealthMonitor();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter heart rate (60-160 bpm): ");
        healthMonitor.setHeartRate(sc.nextInt());
        System.out.println("Enter blood pressure (80-120 mmHg): ");
        healthMonitor.setBloodPressure(sc.nextInt());
        System.out.println("enter temperature (97-99.8 °F): ");
        healthMonitor.setTemperature(sc.nextDouble());
        // Update the health parameters

        // Retrieve and display the health parameters
        System.out.println("Heart rate: " + healthMonitor.getHeartRate() + " bpm");
        System.out.println("Blood pressure: " + healthMonitor.getBloodPressure() + " mmHg");
        System.out.println("Temperature: " + healthMonitor.getTemperature() + " °F");
    }
}

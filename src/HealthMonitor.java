public class HealthMonitor {
    private int heartRate;
    private int bloodPressure;
    private double temperature;

    public HealthMonitor() {
        this.heartRate = 0;
        this.bloodPressure = 0;
        this.temperature = 0.0;
    }

    public void setHeartRate(int heartRate) {
        if (heartRate >= 60 && heartRate <= 160) {
            this.heartRate = heartRate;
        } else {
            System.out.println("Heart rate out of normal range (60-160 bpm).");
        }
    }

    public void setBloodPressure(int bloodPressure) {
        if (bloodPressure >= 80 && bloodPressure <= 120) {
            this.bloodPressure = bloodPressure;
        } else {
            System.out.println("Blood pressure out of normal range (80-120 mmHg).");
        }
    }

    public void setTemperature(double temperature) {
        if (temperature >= 97.0 && temperature <= 99.8) {
            this.temperature = temperature;
        } else {
            System.out.println("Temperature out of normal range (97-99.8 °F).");
        }
    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }
}

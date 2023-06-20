import java.awt.*;

public class Car {
    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailLightsWorking;

    public Car(double averageMilesPerGallon, String licensePlate, Color paintColor, boolean areTailLightsWorking) {
        this.averageMilesPerGallon = averageMilesPerGallon;
        this.licensePlate = licensePlate;
        this.paintColor = paintColor;
        this.areTailLightsWorking = areTailLightsWorking;
    }

    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }

    public double speedUp(double currentSpeed) {
        currentSpeed += 100;
        return currentSpeed;
    }
}

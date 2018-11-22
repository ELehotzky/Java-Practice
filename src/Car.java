import java.awt.*;

public class Car {
	
	// the "blue print" for making cars

	double avgMilesPerGallon;
	String licensePlate;
	Color paintColor;
	boolean tailLightsWorking;
		
	//method
	public Car(double inputAvgMPG, String inputLicensePlate, Color inputPaintColor, boolean inputTailLightsWorking) {
		this.avgMilesPerGallon = inputAvgMPG;
		this.licensePlate = inputLicensePlate;
		this.paintColor = inputPaintColor;
		this.tailLightsWorking = inputTailLightsWorking;
	}
	
	public void changePaintColor(Color newPaintColor) {
		this.paintColor = newPaintColor;
	}
	
	public double speedingUp(double currentSpeed) {
		currentSpeed += 100;
		return currentSpeed;
	}

}

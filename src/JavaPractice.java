import java.awt.*;

public class JavaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("Erica");
		
		// the "body shop", where cars are created
		Car myCar = new Car(
				25.5, "CDY2805", Color.RED, true
			); 
		
		Car tedCar = new Car(
				13.3, "30TSY3K", Color.BLACK, false
			); 
		
		System.out.println("My car's license plate: " + myCar.licensePlate);
		System.out.println(myCar.paintColor);
		System.out.println("Ted's car's License Plate: " + tedCar.licensePlate);
		
		myCar.changePaintColor(Color.CYAN);
		
		System.out.println(myCar.paintColor);
		
	}
}

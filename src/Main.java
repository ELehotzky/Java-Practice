import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		// 31, 45, 22, 98, 10
//		int[] numbers = new int[5];
//		
//		numbers[0] = 31;
//		numbers[1] = 45;
//		numbers[2] = 22;
//		numbers[3] = 98;
//		numbers[4] = 10;
//		
//		int[] numbers2 = {31, 45, 22, 98, 10};
//		
//		Arrays.sort(numbers);
//		System.out.println(Arrays.toString(numbers));
//		
//		String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Kitkat"};
//		System.out.println("Index 1: " + myFavoriteCandyBars[1]);
//		myFavoriteCandyBars[2] = "Butterfinger";
//		System.out.println(myFavoriteCandyBars.length);
//		
//		System.out.println(Array.get(myFavoriteCandyBars, 2));
//		
		Car myCar = new Car(25.5, "345CYB", Color.BLUE, true);
		
		double myCarSpeed = 50;
		myCarSpeed = myCar.speedingUp(myCarSpeed);
		System.out.println(myCarSpeed);
		
	}
}

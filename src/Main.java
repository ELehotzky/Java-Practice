import java.awt.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		// TODO Auto-generated method stub
		String userInput = sc.next();
		String uppercased = userInput.toUpperCase();
		System.out.println(userInput);
		System.out.println(uppercased);
		
		char firstChar = userInput.charAt(0);
		System.out.println(firstChar);
		
		System.out.println("Contains: " + userInput.contains("Enter".toLowerCase()));
	}
}

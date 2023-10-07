package week05;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		AsteriskLogger a = new AsteriskLogger();
		SpacedLogger s = new SpacedLogger();
		
		System.out.print("Enter a string: ");
		String input = in.nextLine();
		
		a.log(input);
		System.out.println("\n\n");
		a.error(input);
		
		
		System.out.println("--------------------------------------------");

		
		s.log(input);
		System.out.println("\n\n");
		s.error(input);
	}

}

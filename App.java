package week05;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsteriskLogger a = new AsteriskLogger();
		SpacedLogger s = new SpacedLogger();
		
		a.log("Hello");
		System.out.println("\n\n");
		a.error("Hello World");
		
		
		System.out.println("--------------------------------------------");

		
		
		s.log("Hello");
		System.out.println("\n\n");
		s.error("Hello World");
	}

}

package week05;

public class AsteriskLogger implements Logger {

	/**
	 * Prints the log passed in with asterisks before and after the string
	 */
	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");
		
	}

	/**
	 * Prints the error passed, inside of a box of asterisks, with the ERROR: preceding the string 
	 */
	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println("********************************");
		System.out.println("*******Error: " + error + "*******");
		System.out.println("********************************");
	}

}

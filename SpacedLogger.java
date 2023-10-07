package week05;

public class SpacedLogger implements Logger{

	/**
	 * Prints out the log with spaces in between each character
	 */
	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		String output = "";
		
		// Iterate through the string and concatenate a new String with spaces in between
		for (int i = 0; i < log.length(); i++) {
			// If it is the first character, we do not add a space in the beginning
			if (i == 0)
				output += log.charAt(i);
			else 
				output += " " + log.charAt(i);
		}
		
		System.out.println(output);
		
	}

	/**
	 * Prints out the error string passed, with spaces in between each character, with in with "Error:" preceding the input
	 */
	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		String output = "";
		
		// Iterate through the string and concatenate a new String with spaces in between
		for (int i = 0; i < error.length(); i++) {
			// If it is the first character, we do not add a space in the beginning
			if (i == 0)
				output += String.valueOf(error.charAt(i));
			else
				output += " " + String.valueOf(error.charAt(i));
		}
		
		System.out.println("ERROR: " + output);
	}

}

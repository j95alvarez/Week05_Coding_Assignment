package week05;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println("****************");
		System.out.println("***Error: " + error + "***");
		System.out.println("****************");
	}

}

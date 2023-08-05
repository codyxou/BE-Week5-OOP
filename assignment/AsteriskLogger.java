package assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		
		System.out.println("******************\n" + 
							"*** " + "Log: " + log + " ***\n" + 
						   "******************\n");
	}

	@Override
	public void error(String error) {
		System.out.println("********************\n" + 
				"*** " + "Error: " + error + " ***\n" + 
			   "********************\n");
		
	}

}

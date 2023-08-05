package assignment;

public class AsteriskLogger implements Logger {
//this was less tricker to implement compared to space logger. Used a system out to add the asterisks and concatenate with the string variable, log and error respectively. 
	@Override
	public void log(String log) {
		//
		
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

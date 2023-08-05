package assignment;

public class SpacedLogger implements Logger {

	@Override
	//using a loop to iterate through the length of the string (log and error in this case). As the string is iterated through, it is being converted as a character into variable c. variable c is logged out to the console and a space is added
	public void log(String log) {
		for (int i = 0; i < log.length(); i++) {
			char c = log.charAt(i);
			System.out.print(c + " ");
		}
		//adding a line break to clean up the code a bit in the console. 
		System.out.println("\n");
	}

	@Override
	public void error(String error) {
		for (int i = 0; i < error.length(); i++) {
			char c = error.charAt(i);
			System.out.print(c + " ");
		
	}

}
}
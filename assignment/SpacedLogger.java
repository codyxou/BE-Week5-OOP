package assignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		for (int i = 0; i < log.length(); i++) {
			char c = log.charAt(i);
			System.out.print(c + " ");
		}
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
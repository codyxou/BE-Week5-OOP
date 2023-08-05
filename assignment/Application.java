package assignment;

public class Application {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		
		logger.log("Log");
		logger.error("Error");
		
		Logger loggers = new SpacedLogger();
		
		loggers.log("Log");
		loggers.error("Error");
		
	}

}

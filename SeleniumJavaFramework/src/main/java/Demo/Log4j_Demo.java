package Demo;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_Demo {
	
	private static Logger logger =LogManager.getLogger(Log4j_Demo.class);
	public static void main(String[] args) {
		
		System.out.println("\n hello world...\n");
		logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is warning message");
		
		System.out.println("\n completed");
		
	}
	

}

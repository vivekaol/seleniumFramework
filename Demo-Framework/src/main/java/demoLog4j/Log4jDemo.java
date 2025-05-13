package demoLog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Log4jDemo {
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world......");

		logger.trace("This is trace message");
		logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.fatal("This is fatal message");
		
		System.out.println("this is completed");
		
	}

}

package log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Demo1Test {
	private static final Logger log = LogManager.getLogger(Demo1Test.class.getName());
	@Test
	public void log4j()
	{
		log.debug("I am debugging");
		log.fatal("I am fatal");
		log.error("I am error");
		log.info("i am info");
	}

}

package log4JA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Demo2Test {
	private static final Logger log = LogManager.getLogger(Demo2Test.class);
	@Test
	public void log4j()
	{
		log.debug("I am debugging2");
		log.fatal("I am fatal2");
		log.error("I am error2");
		log.info("i am info2");
	}

}

package amazon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class sampleclass {
private static Logger log =LogManager.getLogger(sampleclass.class.getName());
	public static void main(String[] args) {
		
log.error("just to show how log xml work");
log.fatal("an example how xml file works");
	}

}

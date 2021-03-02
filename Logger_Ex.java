package core.string.stringBuffer.stringBuilder;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logger_Ex {
	private static org.apache.log4j.Logger logger = Logger.getLogger(Logger_Ex.class);
	
    public static void main(String[] args) {

			logger.trace("Trace");
			logger.debug("Debug");
			logger.info("Info");
			logger.warn("Warn");
			logger.error("Error");
			logger.fatal("Fatal");
			
			try {
				initializeLog();
				System.out.println(10/0);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				logger.error("FileNotFoundException : ", e);
			}catch (ArithmeticException ae) {
				ae.printStackTrace();
				logger.error("Exception : ", ae);
			}
    }
    
    private static void initializeLog() throws FileNotFoundException {
		DOMConfigurator.configure("oislog.xml");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("OIS");
		boolean logToFile = Boolean.valueOf(resourceBundle.getString("log_to_file"));
		if (logToFile) {
			String logFolderPath = resourceBundle.getString("log");
			String logFileName = (new Date()).getTime() + ".log";
			System.setOut(new PrintStream(new FileOutputStream(logFolderPath+ "Out" + logFileName)));
			System.setErr(new PrintStream(new FileOutputStream(logFolderPath+ "Err" + logFileName)));
		}
	}
}
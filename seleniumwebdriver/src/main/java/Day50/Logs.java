package Day50;

public class Logs {
/*	
1.	 What is log?
	it is the record of event in the form of text.
	logging helps to debug the issue, track the execution flow of testcases
	-------------------------------------------------------------------------
   
2.	What are the Log Levels in Logging?

			Answer:

			Common log levels are:

			Log Level	Purpose
			ALL
			TRACE	Very detailed information
			DEBUG	Used for debugging
			INFO	General test execution steps
			WARN	Warning messages
			ERROR	Test failure or issues
			FATAL	Critical failure
			OFF
			
--------------------------------------------------------------------------------------------------------------	
3.	How we implement Logging in Selenium

	1.Add logging dependency (Log4j) in pom.xml

	2. Create a log4j configuration file (log4j2.xml) under src/test/resource

	3. Initialize logger in BaseClass.
	----------------------------------------------------------------------------------------------------------------
	
4.	Where do we initialize Logger in Selenium Framework?

			Answer:

			The logger is usually initialized in the BaseClass, so it can be reused by all test classes.

			Example:

			Logger logger = LogManager.getLogger(this.getClass());

			Then we use it like:

			logger.info("Browser launched");
			logger.error("Test failed");
	-------------------------------------------------		------------------------------------------------
			
5.			What configuration file is used for Log4j?

					Answer:

					Log4j uses a configuration file called:

					log4j2.xml

					This file defines:

					Log level

					Log format

					Log file location

					Appenders (Console/File)
	
	

*/
}

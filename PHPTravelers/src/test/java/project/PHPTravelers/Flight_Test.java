package project.PHPTravelers;
import java.io.File;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Flight_Test extends Flight {
	  public static Logger log=Logger.getLogger(Flight_Test.class);
@BeforeTest
public void start() throws Exception {
	    LaunchBrowser l1=new LaunchBrowser();
		Flight f1=new Flight();
}	
		
	      @Test
		public static void test() throws Exception{
	    	  PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\PHPTravelers\\PHPTravelers\\Resources\\Log4j.properties");
			Launch();
			
            log.info("Flight");
          
				
            flights();
			

		}
	      @AfterTest
	      public void close() throws InterruptedException
	      {
	      	Thread.sleep(2000);
	      	driver.close();
	      }
			}







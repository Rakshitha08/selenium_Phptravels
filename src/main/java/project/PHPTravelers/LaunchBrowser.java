package project.PHPTravelers;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class LaunchBrowser {
    public static WebDriver driver;
      public static Properties prop = new Properties();
      public static Logger log=null;
      
      public static void Launch() throws Exception {
       FileInputStream fs=new FileInputStream("C:\\Users\\Online Test\\git\\PHPTravelers\\PHPTravelers\\src\\main\\java\\file\\base.properties");
		prop.load(fs);
		PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\PHPTravelers\\PHPTravelers\\Resources\\Log4j.properties");
		log=Logger.getLogger(LaunchBrowser.class);
		System.setProperty("webdriver.chrome.driver", "C:\\rakshitha\\chrome\\chromedriver\\chromedriver.exe"); 
		 driver = new ChromeDriver();
		 log.info("launch browser");
         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       //  driver.manage().window().maximize();
         driver.get(prop.getProperty("url"));
      //   driver.manage().window().maximize();
		
	}

}

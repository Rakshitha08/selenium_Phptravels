package project.PHPTravelers;

import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Registration_Test  extends HomePage {
    public static Logger log=Logger.getLogger(Registration_Test.class);
    
	@Test
	public static void userRegistration() throws Exception  {
		PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\PHPTravelers\\PHPTravelers\\Resources\\Log4j.properties");
		HomePage h=new HomePage();
		h.Launch();
		h.signup();
		log.info("Registration page");
		RegistrationPage r = new RegistrationPage();
		r.firstname().sendKeys(h.prop.getProperty("firstname"));
		r.lastname().sendKeys(h.prop.getProperty("lastname"));
		r.mobile().sendKeys(h.prop.getProperty("mobile"));
		r.email().sendKeys(h.prop.getProperty("email"));
		r.password().sendKeys(h.prop.getProperty("password"));
		r.confirmpassword().sendKeys(h.prop.getProperty("confirmpassword"));
		r.Rsubmit();
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File("C:\\screenshot\\Registration.png"));
        log.info("Registration");
        	
      
        }
	@AfterTest
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	}


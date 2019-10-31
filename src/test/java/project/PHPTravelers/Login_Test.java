package project.PHPTravelers;

import java.io.File;
import java.io.IOException;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class Login_Test extends Login{
	public static Logger log=Logger.getLogger(Login_Test.class);
	
	
@Test
public static void Login() throws Exception {
	PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\PHPTravelers\\PHPTravelers\\Resources\\Log4j.properties");
	HomePage h=new HomePage();
	h.Launch();
	h.driver.get(h.prop.getProperty("url"));
	h.login();
    log.info("Login");
	Login l=new Login();
	l.email().sendKeys(h.prop.getProperty("email"));
	l.password().sendKeys(h.prop.getProperty("password"));
	l.login1();
	
}


@AfterTest
public void close() throws InterruptedException
{
	Thread.sleep(2000);
	driver.close();
}
}